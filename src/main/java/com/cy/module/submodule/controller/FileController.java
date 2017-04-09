package com.cy.module.submodule.controller;

import com.cy.module.submodule.service.FileService;
import common.utils.Commons;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * Created by Administrator on 2017/4/5.
 */
@Controller
@RequestMapping("/fileController")
public class FileController {

    private static final Logger logger = Logger.getLogger(StudentController.class);

    @Autowired
    private FileService fileService;

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
        if (cmMpFile.getOriginalFilename() != null && ! cmMpFile.getOriginalFilename().trim().equals("")) {
            String result = fileService.uploadPic(cmMpFile);
            logger.info("返回的json串:" + result);
            PrintWriter out = response.getWriter();
            out.print(result);
        }

    }

    @RequestMapping("/downloadFile.do")
    public ResponseEntity<byte[]> downloadFile(String stuPic) throws Exception {
        logger.info("看看：" + stuPic);
        String originalFilename = stuPic.substring(stuPic.indexOf("_") + 1);
        String filePath = Commons.UPLOAD_REAL_PATH + stuPic;
        logger.info("文件路径:" + filePath);
        File file = new File(filePath);
        if (file.exists() && file.isFile()) {
            String dfileName = new String(originalFilename.getBytes("gb2312"), "iso8859-1");
            HttpHeaders headers = new HttpHeaders(); headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
            headers.setContentDispositionFormData("attachment", dfileName);
            return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers, HttpStatus.CREATED);
        } else {
            return null;
        }

    }


}
