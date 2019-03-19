package com.dc.dao.impl;

import com.dc.dao.classDao;
import com.dc.pojo.Classxx;
import com.dc.utils.DruidUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class classDaoImpl implements classDao {
    private QueryRunner runner = new QueryRunner(DruidUtil.getDataSource());


    /**
     * 找到当前老师可查看的班级
     * @param teacher_id
     * @return返回当前教师教什么班级
     */
    @Override
    public List<Classxx> findClass(Integer teacher_id) {

        List<Classxx> list = null;
        String sql = "SELECT * FROM classxx WHERE class_teacherid = ?";
        try {
            list = runner.query(sql, new BeanListHandler<>(Classxx.class),teacher_id);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }
}
