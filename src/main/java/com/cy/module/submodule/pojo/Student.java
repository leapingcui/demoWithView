package com.cy.module.submodule.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Student {
    private Integer stuId;

    private String stuPwd;

    private String stuName;

    private String stuPic;

    private String stuSex;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date stuBirth;

    private String stuClaId;

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

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", stuPwd='" + stuPwd + '\'' +
                ", stuName='" + stuName + '\'' +
                ", stuPic='" + stuPic + '\'' +
                ", stuSex='" + stuSex + '\'' +
                ", stuBirth=" + stuBirth +
                ", stuClaId='" + stuClaId + '\'' +
                '}';
    }
}