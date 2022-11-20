package com.example.student.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class StudentInfo {

    private Integer stuId;

    private String stuNo;

    private String stuName;

    private Integer stuAge;

    private String stuSex;

    private Date stuBirthday;

    private String stuAddress;

    private String delFlag;

    private Date createTime;

    private String createBy;

    private Date updateTime;

    private String updateBy;
}