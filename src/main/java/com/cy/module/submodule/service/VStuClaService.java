package com.cy.module.submodule.service;

import com.cy.module.submodule.entity.VStuCla;
import com.github.pagehelper.PageInfo;


/**
 * Created by Administrator on 2017/3/21.
 */
public interface VStuClaService {

    PageInfo<VStuCla> selectAll(Integer pageNum, Integer pageSize);

    VStuCla selectByPrimaryKey(Integer stuId);

    PageInfo<VStuCla> fuzzySearch(String[] stringArr, Integer pageNum, Integer pageSize);
}
