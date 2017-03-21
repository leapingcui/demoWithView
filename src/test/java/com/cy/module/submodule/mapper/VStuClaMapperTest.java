package com.cy.module.submodule.mapper;

import com.cy.module.submodule.BaseTest;
import com.cy.module.submodule.entity.VStuCla;
import com.cy.module.submodule.entity.VStuClaExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Administrator on 2017/3/21.
 */
public class VStuClaMapperTest extends BaseTest{

    @Autowired
    private VStuClaMapper vStuClaMapper;

    @Test
    public void testSelectByExample() {
        PageHelper.startPage(1, 5);
        VStuClaExample example = new VStuClaExample();
        example.setOrderByClause("stu_id");
        List<VStuCla> vStuClas = vStuClaMapper.selectByExample(example);
        PageInfo<VStuCla> pageInfo = new PageInfo<VStuCla>(vStuClas);
        List<VStuCla> vStuClaList = pageInfo.getList();
        for (VStuCla vStuCla : vStuClaList) {
            System.out.println(vStuCla);
        }
        System.out.println("第几页:" + pageInfo.getPageNum());
        System.out.println("共几页:" + pageInfo.getPages());
        System.out.println("共多少条记录:" + pageInfo.getTotal());

    }



}
