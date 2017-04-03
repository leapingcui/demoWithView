package common.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 装载要查询的字段
 */
public class SearchColumn {
    private Integer stuId;

    private String stuName;

    private String stuSex;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date stuBirthStart;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date stuBirthEnd;

    private String claName;

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

    public String getClaName() {
        return claName;
    }

    public void setClaName(String claName) {
        this.claName = claName;
    }

    @Override
    public String toString() {
        return "SearchColumn{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", stuSex='" + stuSex + '\'' +
                ", stuBirthStart=" + stuBirthStart +
                ", stuBirthEnd=" + stuBirthEnd +
                ", claName='" + claName + '\'' +
                '}';
    }
}
