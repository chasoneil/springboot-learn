package com.chason.springbootdemo03.controller;

import com.chason.springbootdemo03.pojo.Student;
import com.chason.springbootdemo03.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @ResponseBody
    @RequestMapping("/student/list")
    public List<Student> findAll() {
        return studentService.findAllStudents();
    }

}
