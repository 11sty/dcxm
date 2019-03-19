package com.dc.dao;

import com.dc.pojo.User;

import java.util.List;

public interface userDao {

    /**
     * 查询是否有当前老师
     * @param userName
     * @return
     */
    User findTeacherByName(String userName);


    /**
     * 通过用户名来进行查询整个老师和其班级
     * @param userName
     * @return
     */
    List<User> findByName(String userName);



}
