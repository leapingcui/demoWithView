package com.cy.module.submodule.service.impl;

import com.cy.module.submodule.pojo.Student;
import com.cy.module.submodule.mapper.StudentMapper;
import com.cy.module.submodule.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2017/3/21.
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT)
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    public int insertSelective(Student student) {
        return studentMapper.insertSelective(student);
    }

    public void updateByPrimaryKeySelective(Student student) {
        studentMapper.updateByPrimaryKeySelective(student);
    }

    public void deleteByPrimaryKey(Integer stuId) {
        studentMapper.deleteByPrimaryKey(stuId);
    }
}
