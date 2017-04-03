package com.cy.module.submodule.service.impl;

import com.cy.module.submodule.entity.VStuCla;
import com.cy.module.submodule.entity.VStuClaExample;
import com.cy.module.submodule.mapper.VStuClaMapper;
import com.cy.module.submodule.service.VStuClaService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import common.pojo.SearchColumn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2017/3/21.
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT)
public class VStuClaServiceImpl implements VStuClaService {

    @Autowired
    private VStuClaMapper vStuClaMapper;

    public PageInfo<VStuCla> selectAll(SearchColumn searchColumn,Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        VStuClaExample example = new VStuClaExample();
        VStuClaExample.Criteria criteria = example.createCriteria();

        if (searchColumn.getStuId() != null)
            criteria.andStuIdEqualTo(searchColumn.getStuId());
        if (searchColumn.getStuName() != null && ! searchColumn.getStuName().trim().equals(""))
            criteria.andStuNameLike("%" + searchColumn.getStuName() + "%");
        if (searchColumn.getStuSex() != null && ! searchColumn.getStuSex().trim().equals(""))
            criteria.andStuSexLike("%" + searchColumn.getStuSex() + "%");
        if (searchColumn.getStuBirthEnd() != null && searchColumn.getStuBirthStart() != null)
            criteria.andStuBirthBetween(searchColumn.getStuBirthStart(), searchColumn.getStuBirthEnd());
        if (searchColumn.getClaName() != null && ! searchColumn.getClaName().trim().equals(""))
            criteria.andClaNameLike("%" + searchColumn.getClaName() + "%");

        List<VStuCla> vStuClas = vStuClaMapper.selectByExample(example);
        PageInfo<VStuCla> pageInfo = new PageInfo<VStuCla>(vStuClas);
        return pageInfo;
    }

    public VStuCla selectByPrimaryKey(Integer stuId) {
        VStuCla vStuCla = vStuClaMapper.selectByPrimaryKey(stuId);
        return vStuCla;
    }
}
