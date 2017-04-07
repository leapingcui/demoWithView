package com.cy.module.submodule.mapper;

import com.cy.module.submodule.pojo.VStuCla;
import com.cy.module.submodule.pojo.VStuClaExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VStuClaMapper {
    int countByExample(VStuClaExample example);

    int deleteByExample(VStuClaExample example);

    int insert(VStuCla record);

    int insertSelective(VStuCla record);

    List<VStuCla> selectByExample(VStuClaExample example);

    VStuCla selectByPrimaryKey(Integer stuId);

    int updateByExampleSelective(@Param("record") VStuCla record, @Param("example") VStuClaExample example);

    int updateByExample(@Param("record") VStuCla record, @Param("example") VStuClaExample example);
}