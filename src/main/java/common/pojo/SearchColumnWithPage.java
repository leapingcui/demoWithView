package common.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 装载要查询的字段
 */
public class SearchColumnWithPage {
    private Integer stuId;

    private String stuName;

    private String stuSex;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date stuBirthStart;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date stuBirthEnd;

    private String claId;

    private String claName;

    private Integer claTotalNum;

    private Integer pageNum;

    private Integer pageSize;

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    public Date getStuBirthStart() {
        return stuBirthStart;
    }

    public void setStuBirthStart(Date stuBirthStart) {
        this.stuBirthStart = stuBirthStart;
    }

    public Date getStuBirthEnd() {
        return stuBirthEnd;
    }

    public void setStuBirthEnd(Date stuBirthEnd) {
        this.stuBirthEnd = stuBirthEnd;
    }

    public String getClaId() {
        return claId;
    }

    public void setClaId(String claId) {
        this.claId = claId;
    }

    public String getClaName() {
        return claName;
    }

    public void setClaName(String claName) {
        this.claName = claName;
    }

    public Integer getClaTotalNum() {
        return claTotalNum;
    }

    public void setClaTotalNum(Integer claTotalNum) {
        this.claTotalNum = claTotalNum;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "SearchColumnWithPage{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", stuSex='" + stuSex + '\'' +
                ", stuBirthStart=" + stuBirthStart +
                ", stuBirthEnd=" + stuBirthEnd +
                ", claId='" + claId + '\'' +
                ", claName='" + claName + '\'' +
                ", claTotalNum=" + claTotalNum +
                ", pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                '}';
    }
}
