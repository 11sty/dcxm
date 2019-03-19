package com.dc.service;

import com.dc.pojo.Stuxx;
import com.dc.utils.PageUtil;

public interface stuxxService {
    /**
     * 查询分页分类列表
     * @param pageUtil : 分页类对象
     * @param category_id : 分类id
     */
    void getCategoryList(PageUtil<Stuxx> pageUtil, Integer category_id);
}
