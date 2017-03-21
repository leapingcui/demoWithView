package com.cy.module.submodule.entity;

import java.util.Date;

public class VStuCla {
    private Integer stuId;

    private String stuPwd;

    private String stuName;

    private String stuSex;

    private Date stuBirth;

    private String claId;

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

    public String getClaId() {
        return claId;
    }

    public void setClaId(String claId) {
        this.claId = claId == null ? null : claId.trim();
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

    @Override
    public String toString() {
        return "VStuCla{" +
                "stuId=" + stuId +
                ", stuPwd='" + stuPwd + '\'' +
                ", stuName='" + stuName + '\'' +
                ", stuSex='" + stuSex + '\'' +
                ", stuBirth=" + stuBirth +
                ", claId='" + claId + '\'' +
                ", claName='" + claName + '\'' +
                ", claTotalNum=" + claTotalNum +
                '}';
    }
}