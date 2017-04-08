package com.cy.module.submodule.controller;

import com.cy.module.submodule.pojo.Student;
import com.cy.module.submodule.pojo.VStuCla;
import com.cy.module.submodule.service.StudentService;
import com.cy.module.submodule.service.VStuClaService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by Administrator on 2017/3/21.
 */
@Controller
@RequestMapping("/studentController")
public class StudentController {

    private static final Logger logger = Logger.getLogger(StudentController.class);

    @Autowired
    private StudentService studentService;
    @Autowired
    private VStuClaService vStuClaService;

    @RequestMapping("/insertStudentUI.do")
    public String insertStudentUI(){
        return "module/submodule/insertStudent";
    }

    @RequestMapping("/insertStudent.do")
    public String insertStudent(Student student) {
        logger.info("接收到的student" + student);
        int num = studentService.insertSelective(student);
        logger.info("新增影响的行数:"+num);
        return "redirect:/vStuClaController/showAllStudents.do";
    }

    @RequestMapping("/updateStudentUI.do")
    public String updateStudentUI(Model model, Integer stuId){
        logger.info("接收到的学号参数:" + stuId);
        VStuCla vStuCla = vStuClaService.selectByPrimaryKey(stuId);
        String stuPic = vStuCla.getStuPic();
        if (stuPic == null) {
            //事先在磁盘上准备好了noPic.jgg
            vStuCla.setStuPic("/0/0/noPic.jpg");
        }
        model.addAttribute("vStuCla", vStuCla);
        return "module/submodule/updateStudent";
    }

    @RequestMapping("/updateStudent.do")
    public String updateStudent(Student student){
        logger.info("接收到的学生" + student);
        studentService.updateByPrimaryKeySelective(student);
        return "redirect:/vStuClaController/showAllStudents.do";
    }

    @RequestMapping("/deleteStudent.do")
    public String deleteStudent(Integer stuId){
        studentService.deleteByPrimaryKey(stuId);
        return "forward:/vStuClaController/showAllStudents.do";
    }



}
