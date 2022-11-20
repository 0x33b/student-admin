package com.example.student.service;

import com.example.student.pojo.StudentInfo;

import java.util.List;

public interface StudentInfoService {

    public List<StudentInfo> getStuList();

    public StudentInfo getById(Integer stuId);

    public Integer add(StudentInfo studentInfo);

    public Integer modify(StudentInfo studentInfo);

    public Integer delete(Integer stuId);
}
