package com.cy.module.submodule.controller;

import com.cy.module.submodule.entity.VStuCla;
import com.cy.module.submodule.service.VStuClaService;
import com.github.pagehelper.PageInfo;
import common.utils.MyStringUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Administrator on 2017/3/21.
 */
@Controller
@RequestMapping("/vStuClaController")
public class VStuClaController {

    private static final Logger logger = Logger.getLogger(VStuClaController.class);

    @Autowired
    private VStuClaService vStuClaService;

    @RequestMapping("/fuzzySearch.do")
    public String fuzzySearch(Model model,String fuzzyInfo, Integer pageNum, Integer pageSize) {
        logger.info("接收到的字符串：" + fuzzyInfo );
        logger.info("当前页：" + pageNum + " ============== " + "每页记录数：" + pageSize);
        if (pageNum == null) pageNum = 1;
        if (pageSize == null) pageSize = 5;
        String[] stringArr = MyStringUtil.getStringArr(fuzzyInfo);
        PageInfo<VStuCla> pageInfo = vStuClaService.fuzzySearch(stringArr,pageNum,pageSize);
        model.addAttribute("pageInfo", pageInfo);
        return "mainFrame";
    }

    @RequestMapping("/showAllStudents.do")
    public String showAllStudents(Model model, Integer pageNum, Integer pageSize) {
        logger.info("当前页：" + pageNum + " ============== " + "每页记录数：" + pageSize);
        if (pageNum == null) pageNum = 1;
        if (pageSize == null) pageSize = 5;
        PageInfo<VStuCla> pageInfo = vStuClaService.selectAll(pageNum, pageSize);
        model.addAttribute("pageInfo", pageInfo);
        return "mainFrame";
    }

    @RequestMapping("/detailedStudent.do")
    public String detailedStudent(Model model, Integer stuId){
        VStuCla vStuCla = vStuClaService.selectByPrimaryKey(stuId);
        model.addAttribute("vStuCla", vStuCla);
        return "module/submodule/detailedStudent";
    }


}
