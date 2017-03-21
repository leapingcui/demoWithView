package com.cy.module.submodule.service;

import com.cy.module.submodule.entity.Student;

/**
 * Created by Administrator on 2017/3/21.
 */
public interface StudentService {
    int insertSelective(Student student);

    void updateByPrimaryKeySelective(Student student);

    void deleteByPrimaryKey(Integer stuId);
}
