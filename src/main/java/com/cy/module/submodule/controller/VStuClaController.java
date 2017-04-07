package com.cy.module.submodule.controller;

import com.cy.module.submodule.pojo.VStuCla;
import com.cy.module.submodule.service.VStuClaService;
import com.github.pagehelper.PageInfo;
import common.pojo.SearchColumn;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/3/21.
 */
@Controller
@RequestMapping("/vStuClaController")
public class VStuClaController {

    private static final Logger logger = Logger.getLogger(VStuClaController.class);

    @Autowired
    private VStuClaService vStuClaService;

    @RequestMapping("/showAllStudents.do")
    public String showAllStudents(Model model, SearchColumn searchColumn,Integer pageNum,Integer pageSize) {
        logger.info("接受的对象:" + searchColumn);
        logger.info("当前页pageNum：" + pageNum + " ============== " + "每页记录数pageSize：" + pageSize);
        if (pageNum == null) pageNum = 1;
        if (pageSize == null) pageSize = 5;
        logger.info("现在的当前页pageNum：" + pageNum + " ============== " + "现在的每页记录数pageSize：" + pageSize);
        PageInfo<VStuCla> pageInfo = vStuClaService.selectAll(searchColumn,pageNum,pageSize);
        logger.info("看看回显的当前页" + pageInfo.getPageNum());
        model.addAttribute("pageInfo", pageInfo);
        logger.info("要回显的查询对象:" + searchColumn);
        model.addAttribute("searchColumn", searchColumn);
        return "mainFrame";
    }

    @RequestMapping("/detailedStudent.do")
    public String detailedStudent(Model model, Integer stuId){
        VStuCla vStuCla = vStuClaService.selectByPrimaryKey(stuId);
        model.addAttribute("vStuCla", vStuCla);
        return "module/submodule/detailedStudent";
    }


}
