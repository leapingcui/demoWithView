package com.cy.module.submodule.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class VStuCla {
    private Integer stuId;

    private String stuPwd;

    private String stuName;

    private String stuPic;

    private String stuSex;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date stuBirth;

    private String stuClaId;

    private String claName;

    private Integer claTotalNum;

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuPwd() {
        return stuPwd;
    }

    public void setStuPwd(String stuPwd) {
        this.stuPwd = stuPwd == null ? null : stuPwd.trim();
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    public String getStuPic() {
        return stuPic;
    }

    public void setStuPic(String stuPic) {
        this.stuPic = stuPic == null ? null : stuPic.trim();
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex == null ? null : stuSex.trim();
    }

    public Date getStuBirth() {
        return stuBirth;
    }

    public void setStuBirth(Date stuBirth) {
        this.stuBirth = stuBirth;
    }

    public String getStuClaId() {
        return stuClaId;
    }

    public void setStuClaId(String stuClaId) {
        this.stuClaId = stuClaId == null ? null : stuClaId.trim();
    }

    public String getClaName() {
        return claName;
    }

    public void setClaName(String claName) {
        this.claName = claName == null ? null : claName.trim();
    }

    public Integer getClaTotalNum() {
        return claTotalNum;
    }

    public void setClaTotalNum(Integer claTotalNum) {
        this.claTotalNum = claTotalNum;
    }
}