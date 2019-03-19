package com.dc.dao.impl;

import com.dc.dao.stuDao;
import com.dc.pojo.Stuxx;
import com.dc.utils.DruidUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.io.StringReader;
import java.sql.SQLException;
import java.sql.Time;
import java.util.List;

public class stuxxDaoImpl implements stuDao {

    private QueryRunner runner = new QueryRunner(DruidUtil.getDataSource());


    /**
     * 依据班级号找id找到
     * @param classId
     * @return
     */
    @Override
    public List<Stuxx> findStuxxByClassId(Integer classId) {
        String sql = "SELECT * FROM stuxx WHERE class=?";
        List<Stuxx> query = null;
        try {
            query = runner.query(sql,new BeanListHandler<>(Stuxx.class),classId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return query;
    }


    /**
     *
     * 按照分页查找
     * @param classId
     * @param page
     * @param pageSize
     * @return
     */
    @Override
    public List<Stuxx> findStuxxByClassId(Integer classId,Integer page, Integer pageSize) {

        /**
         * 分页处理
         */
        String sql = "SELECT * FROM stuxx WHERE class=? limit ?,?";
        List<Stuxx> query = null;
        try {
            query = runner.query(sql,new BeanListHandler<>(Stuxx.class),classId,(page-1)*pageSize,pageSize);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return query;
    }


    /**
     * 查询当前班级有多少人，才好进行分页
     * @param class_id
     * @return
     */
    @Override
    public Integer getTotalCount(Integer class_id) {

        String sql = "select count(1) from stuxx where class=?";

        Long query = null;
        try {
            query = runner.query(sql, new ScalarHandler<>(), class_id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Integer.valueOf(query.toString());
    }


    /**
     * 2019/3/5
     * 根据老师设置的迟到时间来更新数据库中的islate值
     * @param time
     * @return
     */
    @Override
    public Boolean updateStuIslate(Time time) {
        /**
         * SELECT * FROM stuxx WHERE class=2 AND add_time>DATE_FORMAT( 0,'%H %i %S')
         */
        String sql = "update";
        return null;
    }


}
