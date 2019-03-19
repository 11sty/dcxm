package com.dc.dao;

import com.dc.pojo.Classxx;

import java.util.List;

public interface classDao {
    List<Classxx> findClass(Integer teacher_id);
}
