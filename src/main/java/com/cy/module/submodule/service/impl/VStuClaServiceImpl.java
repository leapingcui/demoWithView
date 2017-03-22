package com.cy.module.submodule.service.impl;

import com.cy.module.submodule.entity.VStuCla;
import com.cy.module.submodule.entity.VStuClaExample;
import com.cy.module.submodule.mapper.VStuClaMapper;
import com.cy.module.submodule.service.VStuClaService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import common.pojo.SearchColumnWithPage;
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

    public PageInfo<VStuCla> selectAll(SearchColumnWithPage searchColumnWithPage) {
        PageHelper.startPage(searchColumnWithPage.getPageNum(), searchColumnWithPage.getPageSize());
        VStuClaExample example = new VStuClaExample();
        VStuClaExample.Criteria criteria = example.createCriteria();

        if (searchColumnWithPage.getStuId() != null)
            criteria.andStuIdEqualTo(searchColumnWithPage.getStuId());
        if (searchColumnWithPage.getStuName() != null && ! searchColumnWithPage.getStuName().trim().equals(""))
            criteria.andStuNameLike("%" + searchColumnWithPage.getStuName() + "%");
        if (searchColumnWithPage.getStuSex() != null && ! searchColumnWithPage.getStuSex().trim().equals(""))
            criteria.andStuSexLike("%" + searchColumnWithPage.getStuSex() + "%");
        if (searchColumnWithPage.getStuBirthStart() != null && searchColumnWithPage.getStuBirthEnd() != null)
            criteria.andStuBirthBetween(searchColumnWithPage.getStuBirthStart(),searchColumnWithPage.getStuBirthEnd());
        if (searchColumnWithPage.getClaName() != null && ! searchColumnWithPage.getClaName().trim().equals(""))
            criteria.andClaNameLike("%" + searchColumnWithPage.getClaName() + "%");

        List<VStuCla> vStuClas = vStuClaMapper.selectByExample(example);
        PageInfo<VStuCla> pageInfo = new PageInfo<VStuCla>(vStuClas);
        return pageInfo;
    }

    public VStuCla selectByPrimaryKey(Integer stuId) {
        VStuCla vStuCla = vStuClaMapper.selectByPrimaryKey(stuId);
        return vStuCla;
    }
}
