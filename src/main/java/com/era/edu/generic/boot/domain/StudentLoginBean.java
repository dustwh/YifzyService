package com.era.edu.generic.boot.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="student")
public class StudentLoginBean implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer stuId;
    private String stuName;
//    @Column(name="stu_tel")
    private String stuTel;
//    @Column(name="stu_password")
    private String stuPassword;

    public StudentLoginBean() {
    }

    public StudentLoginBean(String stuName,String stuTel, String stuPassword) {
        this.stuName = stuName;
        this.stuTel = stuTel;
        this.stuPassword = stuPassword;
    }

    public StudentLoginBean(String stuName,Integer stuId, String stuTel, String stuPassword) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuTel = stuTel;
        this.stuPassword = stuPassword;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuTel() {
        return stuTel;
    }

    public void setStuTel(String stuTel) {
        this.stuTel = stuTel;
    }

    public String getStuPassword() {
        return stuPassword;
    }

    public void setStuPassword(String stuPassword) {
        this.stuPassword = stuPassword;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }
}
