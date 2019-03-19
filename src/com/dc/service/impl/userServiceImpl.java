package com.dc.service.impl;

import com.dc.dao.impl.userDaoImpl;
import com.dc.dao.userDao;
import com.dc.dto.BaseDto;
import com.dc.pojo.User;
import com.dc.service.userService;
import com.dc.utils.MD5Util;

import java.util.List;

public class userServiceImpl implements userService {

    private userDao md = new userDaoImpl();

    @Override
    public BaseDto<User> login(User member,String veriCode,String sureCode) {
        /**
         * 用户登陆:
         * 用户名错了: 提示没有该用户
         * 用户密码错了: 密码错误
         * 验证码是否对应
         * 先通过用户名去查询,没有数据,有数据: 对比密码
         */
        // 1. 数据验证
        if(member.getUser_nikname() == null || member.getUser_nikname().isEmpty()){
            return new BaseDto<>(400,"用户名不能为空!",null);
        }
        if(member.getUser_pwd() == null || member.getUser_pwd().isEmpty()){
            return new BaseDto<>(400,"用户密码不能为空!",null);
        }
        if(veriCode == null || veriCode.isEmpty()){
            return new BaseDto<>(400,"用户密码不能为空!",null);
        }

        //System.out.println("ber"+member.getUser_pwd());
        //2. 再去查询数据库
        User dbMember = md.findTeacherByName(member.getUser_nikname());
        if(dbMember == null){
            return new BaseDto<>(400,"该用户不存在!",dbMember);
        }

        //3. 进行密码的验证
        if(!member.getUser_pwd().equals(dbMember.getUser_pwd())){
            return new BaseDto<>(400,"密码错误!",dbMember);
        }

        //3. 进行验证码的验证
        if(!veriCode.equalsIgnoreCase(sureCode)){
            return new BaseDto<>(400,"验证码错误!",dbMember);
        }

        // 5. 登陆成功
        return new BaseDto<>(200,"登陆成功!",dbMember);
    }


    /**
     * 调用Dao方法
     * @param username
     * @return
     */
    @Override
    public List<User> findAllTeacherxxByUsername(String username) {
        List<User> users = md.findByName(username);
        return users;
    }

}
