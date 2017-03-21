package com.cy.module.submodule.service.impl;

import com.cy.module.submodule.entity.VStuCla;
import com.cy.module.submodule.entity.VStuClaExample;
import com.cy.module.submodule.mapper.VStuClaMapper;
import com.cy.module.submodule.service.VStuClaService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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

    public PageInfo<VStuCla> fuzzySearch(String[] stringArr, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        VStuClaExample example = new VStuClaExample();

        example.or().andStuNameLike("%" + stringArr[0] + "%");
        example.or().andStuSexLike("%" + stringArr[0] + "%");
        example.or().andClaIdLike("%" + stringArr[0] + "%");
        example.or().andClaNameLike("%" + stringArr[0] + "%");

        List<VStuCla> vStuClas = vStuClaMapper.selectByExample(example);
        PageInfo<VStuCla> pageInfo = new PageInfo<VStuCla>(vStuClas);
        return pageInfo;
    }

    public PageInfo<VStuCla> selectAll(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        VStuClaExample example = new VStuClaExample();
        example.setOrderByClause("stu_id");
        List<VStuCla> vStuClas = vStuClaMapper.selectByExample(example);
        PageInfo<VStuCla> pageInfo = new PageInfo<VStuCla>(vStuClas);
        return pageInfo;
    }

    public VStuCla selectByPrimaryKey(Integer stuId) {
        VStuCla vStuCla = vStuClaMapper.selectByPrimaryKey(stuId);
        return vStuCla;
    }
}
