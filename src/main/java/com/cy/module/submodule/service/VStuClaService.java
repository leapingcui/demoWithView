package com.cy.module.submodule.service;

import com.cy.module.submodule.entity.VStuCla;
import com.github.pagehelper.PageInfo;
import common.pojo.SearchColumnWithPage;


/**
 * Created by Administrator on 2017/3/21.
 */
public interface VStuClaService {

    PageInfo<VStuCla> selectAll(SearchColumnWithPage searchColumnWithPage);

    VStuCla selectByPrimaryKey(Integer stuId);



}
