package com.example.student.dao;

import com.example.student.pojo.StudentInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface StudentInfoMapper {

    int deleteByPrimaryKey(Integer stuId);

    int insert(StudentInfo record);

    int insertSelective(StudentInfo record);

    StudentInfo selectByPrimaryKey(Integer stuId);

    int updateByPrimaryKeySelective(StudentInfo record);

    int updateByPrimaryKey(StudentInfo record);

    List<StudentInfo> selectStuList();
}