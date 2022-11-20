package com.example.student.service.impl;

import com.example.student.dao.StudentInfoMapper;
import com.example.student.pojo.StudentInfo;
import com.example.student.service.StudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentInfoServiceImpl implements StudentInfoService {

    @Autowired
    public StudentInfoMapper studentInfoMapper;

    @Override
    public List<StudentInfo> getStuList() {
        return studentInfoMapper.selectStuList();
    }

    @Override
    public StudentInfo getById(Integer stuId) {
        return studentInfoMapper.selectByPrimaryKey(stuId);
    }

    @Override
    public Integer add(StudentInfo studentInfo) {
        return studentInfoMapper.insertSelective(studentInfo);
    }

    @Override
    public Integer modify(StudentInfo studentInfo) {
        return studentInfoMapper.updateByPrimaryKeySelective(studentInfo);
    }

    @Override
    public Integer delete(Integer stuId) {
        return studentInfoMapper.deleteByPrimaryKey(stuId);
    }
}
