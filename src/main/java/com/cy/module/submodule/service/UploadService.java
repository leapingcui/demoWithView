package com.cy.module.submodule.service;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

/**
 * Created by Administrator on 2017/4/8.
 */
public interface UploadService {

    String uploadPic(CommonsMultipartFile cmMpFile);

}
