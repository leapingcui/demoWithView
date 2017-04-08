package com.cy.module.submodule.controller;

import com.cy.module.submodule.service.UploadService;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import common.utils.Commons;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.UUID;

/**
 * Created by Administrator on 2017/4/5.
 */
@Controller
@RequestMapping("/uploadController")
public class UploadController {

    private static final Logger logger = Logger.getLogger(StudentController.class);

    @Autowired
    private UploadService uploadService;

    @RequestMapping("/uploadPic.do")
    public void uploadPic(HttpServletRequest request, HttpServletResponse response, String fileName) throws IOException {
        //设置编码
        if (request.getCharacterEncoding() == null) {
            request.setCharacterEncoding("UTF-8");
        }
        response.setCharacterEncoding("utf-8");

        //把request转换成多部件请求对象(图片是流类型)
        MultipartHttpServletRequest mpRequest = (MultipartHttpServletRequest) request;
        //根据文件名称获取文件对象
        CommonsMultipartFile cmMpFile = (CommonsMultipartFile) mpRequest.getFile(fileName);

        String result = uploadService.uploadPic(cmMpFile);

        PrintWriter out = response.getWriter();
        out.print(result);
    }

}
