package com.cy.module.submodule.service.impl;

import com.cy.module.submodule.controller.StudentController;
import com.cy.module.submodule.service.UploadService;
import common.utils.Commons;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * Created by Administrator on 2017/4/8.
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT)
public class UploadServiceImpl implements UploadService {

    private static final Logger logger = Logger.getLogger(StudentController.class);

    public String uploadPic(CommonsMultipartFile cmMpFile) {
        String prefix = UUID.randomUUID().toString();
        String suffix = cmMpFile.getOriginalFilename();
        logger.info("原始文件名:" + suffix);
        String newFileName = prefix + "_" + suffix;
        logger.info("新的文件名:" + newFileName);
/*
        Client client = Client.create();
        //把文件关联到远程服务器
        WebResource resource = client.resource(request.getContextPath() + "/upload/" + newFileName);
        //获取文件上传流
        byte[] fbytes = cmMpFile.getBytes();
        //上传
        resource.put(String.class, fbytes);
*/
        //上传文件到磁盘文件夹物理路径
        String rootDir = Commons.UPLOAD_REAL_PATH;
//        用hash算法打散目录，但是在tomcat中很难实现在虚拟目录下新建子目录，所以实现在本地磁盘建好16*16十六进制文件夹
        String subDir = Commons.getDirByHashAlgo(suffix);
        String dir = rootDir + subDir;
        logger.info("物理路径：" + dir);
        if (! new File(dir).exists()) {
            new File(dir).mkdir();
        }
        String uploadPath = dir + "/" + newFileName;
        logger.info("上传路径：" + uploadPath);
        //上传
        File file = new File(uploadPath);
        try {
            cmMpFile.transferTo(file);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("上传出错");
        }

/*
        String absolutePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
                + request.getContextPath() + "/upload/" + newFileName;
*/
//        在tomcat中已经配置了虚拟路径
        String absolutePath = Commons.UPLOAD_VIRT_PATH + subDir + "/" + newFileName;
        logger.info("绝对路径:" + absolutePath);

        //数据库保存相对路径
        String relativePath = subDir + "/" + newFileName;
        logger.info("相对路径:" + relativePath);
        //{"":"","":""}
        String result = "{\"absolutePath\":\"" + absolutePath + "\",\"relativePath\":\"" + relativePath + "\"}";

        return result;
    }

}
