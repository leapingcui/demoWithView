package com.cy.module.submodule.controller;

import com.cy.module.submodule.entity.VStuCla;
import com.cy.module.submodule.service.VStuClaService;
import com.github.pagehelper.PageInfo;
import common.pojo.SearchColumnWithPage;
import common.utils.MyStringUtil;
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
    public String showAllStudents(Model model, SearchColumnWithPage searchColumnWithPage) {
        logger.info("接受的对象:" + searchColumnWithPage);
        Integer pageNum = searchColumnWithPage.getPageNum();
        Integer pageSize = searchColumnWithPage.getPageSize();
        logger.info("当前页：" + pageNum + " ============== " + "每页记录数：" + pageSize);
        if (pageNum == null) searchColumnWithPage.setPageNum(1);
        if (pageSize == null) searchColumnWithPage.setPageSize(5);
        logger.info("现在的对象:" + searchColumnWithPage);
        PageInfo<VStuCla> pageInfo = vStuClaService.selectAll(searchColumnWithPage);
        model.addAttribute("pageInfo", pageInfo);
        model.addAttribute("searchColumnWithPage", searchColumnWithPage);
        return "mainFrame";
    }

    @RequestMapping("/detailedStudent.do")
    public String detailedStudent(Model model, Integer stuId){
        VStuCla vStuCla = vStuClaService.selectByPrimaryKey(stuId);
        model.addAttribute("vStuCla", vStuCla);
        return "module/submodule/detailedStudent";
    }


}
