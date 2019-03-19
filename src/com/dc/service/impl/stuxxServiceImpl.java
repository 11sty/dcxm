package com.dc.service.impl;

import com.dc.dao.impl.stuxxDaoImpl;
import com.dc.dao.stuDao;
import com.dc.pojo.Stuxx;
import com.dc.service.stuxxService;
import com.dc.utils.PageUtil;

import java.util.List;

public class stuxxServiceImpl implements stuxxService {

    private stuDao stuxxDao= new stuxxDaoImpl();


    @Override
    public void getCategoryList(PageUtil<Stuxx> pageUtil, Integer class_id) {
        // 做数据验证
        if(class_id <= 0) {
            return;
        }

        // 获取分页的数据
        List<Stuxx> stuxx = stuxxDao.findStuxxByClassId(class_id, pageUtil.getNowPage(), pageUtil.getPageSize());

        // 获取总的条数
        Integer totalCount = stuxxDao.getTotalCount(class_id);

        // 设置相应的值
        pageUtil.setTotalNums(totalCount);
        pageUtil.setContent(stuxx);
    }
}
