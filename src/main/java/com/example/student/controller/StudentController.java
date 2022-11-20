package com.example.student.controller;

import com.example.student.pojo.StudentInfo;
import com.example.student.service.StudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
    public StudentInfoService studentInfoService;

    /**
     * 查询学生列表
     *
     * @return 学生列表
     */
    @GetMapping(value = "/stuList")
    public List<StudentInfo> getStuList() {
        return studentInfoService.getStuList();
    }

    /**
     * 查询学生详细信息
     * @param stuId 主键
     * @return
     */
    @GetMapping(value = "/{stuId}")
    public StudentInfo getById(@PathVariable Integer stuId) {
        return studentInfoService.getById(stuId);
    }

    /**
     * 新增学生信息
     * @param studentInfo
     */
    @PostMapping(value = "/add")
    public void add(@RequestBody StudentInfo studentInfo) {
        studentInfoService.add(studentInfo);
    }

    /**
     * 修改学生信息
     * @param studentInfo
     */
    @PutMapping(value = "/modify")
    public void modify(@RequestBody StudentInfo studentInfo) {
        studentInfoService.modify(studentInfo);
    }

    /**
     * 根据主键删除学生信息
     * @param stuId
     */
    @DeleteMapping(value = "/{stuId}")
    public void delete(@PathVariable Integer stuId) {
        studentInfoService.delete(stuId);
    }

}
