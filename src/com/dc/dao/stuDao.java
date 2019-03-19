package com.dc.dao;

import com.dc.pojo.Stuxx;

import java.sql.Time;
import java.util.List;

public interface stuDao {
    /**
     * 通过此时的班级号找学生
     * @param classId
     * @return班级学生信息集合
     */
    List<Stuxx> findStuxxByClassId(Integer classId);


    /**
     * 安分页查找
     * @param classId
     * @param page
     * @param pageSize
     * @return
     */
    List<Stuxx> findStuxxByClassId(Integer classId,Integer page, Integer pageSize);


    /**
     * 查看当前页有多少人数
     * @param category_id
     * @return
     */
    Integer getTotalCount(Integer category_id);


    /**
     * 通过日期再进行进一步精确，超过该时间将islate设置为Y
     * @param time
     * @return
     */
    Boolean updateStuIslate(Time time);

}
