package com.cy.module.submodule.service.impl;

import com.cy.module.submodule.pojo.Student;
import com.cy.module.submodule.mapper.StudentMapper;
import com.cy.module.submodule.service.StudentService;
import common.utils.Commons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;

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
        //删除磁盘上的文件
        Student student = studentMapper.selectByPrimaryKey(stuId);
        String stuPic = student.getStuPic();
        String filePath = Commons.UPLOAD_REAL_PATH + stuPic;
        File file = new File(filePath);
        if (file.exists() && file.isFile()) {
            file.delete();
        }
        //删除数据库中的数据
        studentMapper.deleteByPrimaryKey(stuId);
    }

}
