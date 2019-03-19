package com.dc.dao.impl;

import com.dc.dao.userDao;
import com.dc.pojo.Classxx;
import com.dc.pojo.User;
import com.dc.utils.DruidUtil;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class userDaoImpl implements userDao {

    private QueryRunner runner = new QueryRunner(DruidUtil.getDataSource());


    @Override
    public User findTeacherByName(String userName) {
        /**
         * 查询当前老师并包含他所教课的班级，之后通过获取当前id便可以直接在表中显示所要信息
         */
        String sql = "select * from user where user_nikname=? limit 1";
        //"SELECT * FROM cart c LEFT JOIN goods g ON g.cart_goods_id=c.goods_id WHERE c.cart_member_id=? AND c.cart_order_status=0"

        User query = null;
        try {
            query = runner.query(sql, new BeanHandler<>(User.class),userName);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return query;
    }

    @Override
    public List<User> findByName(String userName) {
        /**
         * 查询当前老师并包含他所教课的班级，之后通过获取当前id便可以直接在表中显示所要信息
         */
        String sql = "select * from user c LEFT JOIN classxx g on g.class_teacherid=c.user_id where user_nikname=?";
        //"SELECT * FROM cart c LEFT JOIN goods g ON g.cart_goods_id=c.goods_id WHERE c.cart_member_id=? AND c.cart_order_status=0"

        List<User> users = new ArrayList<>();
        try {
            List<Map<String,Object>> query = runner.query(sql, new MapListHandler(),userName);
            for (Map<String,Object> map : query) {
                User user = new User();
                Classxx classxx = new Classxx();
                BeanUtils.populate(user,map);
                BeanUtils.populate(classxx,map);
                user.setClassxx(classxx);
                /// 将填充好的数据 加入list
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return users;
    }
}
