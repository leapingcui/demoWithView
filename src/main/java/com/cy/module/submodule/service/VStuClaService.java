package com.cy.module.submodule.service;

import com.cy.module.submodule.pojo.VStuCla;
import com.github.pagehelper.PageInfo;
import common.pojo.SearchColumn;


/**
 * Created by Administrator on 2017/3/21.
 */
public interface VStuClaService {

    PageInfo<VStuCla> selectAll(SearchColumn searchColumn,Integer pageNum,Integer pageSize);

    VStuCla selectByPrimaryKey(Integer stuId);



}
