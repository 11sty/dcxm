package com.dc.service;

import com.dc.dto.BaseDto;
import com.dc.pojo.User;

import java.util.List;

public interface userService {
    /**
     * 登陆的方法
     * @param member
     * @return
     */
    BaseDto<User> login(User member,String veriCode,String sureCode);


    /**
     * 找到所有老师及代课班级
     * 2019/3/4
     */
    List<User> findAllTeacherxxByUsername(String username);

}
