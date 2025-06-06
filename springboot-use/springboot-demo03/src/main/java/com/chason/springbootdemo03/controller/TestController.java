package com.chason.springbootdemo03.controller;

import com.chason.springbootdemo03.pojo.Student;
import com.chason.springbootdemo03.service.StudentService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

@Controller
public class TestController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/test01")
    public String test01() {
        // 默认会找 classpath:/templates/${name}.html
        return "test01";
    }

    // 使用request携带信息去前端
    @RequestMapping("/show")
    public String show(HttpServletRequest request) {

        // 设置了一些常见的信息（字符串，整数，对象，list等）
        request.setAttribute("msg", "Hello Thymeleaf!");
        request.setAttribute("count", 1000);
        request.setAttribute("student", new Student(1, "zhangsan", 18));

        List<Student> students = studentService.findAllStudents();
        request.setAttribute("students", students);

        return "test01";
    }

    @RequestMapping("/jump")
    public String jump(int id) {
        System.out.println("获取到页面传来的参数id:" + id);
        return "404";
    }

    @RequestMapping("/show2")
    public String show2(HttpServletRequest request) {
        request.setAttribute("str1", "Hello");
        request.setAttribute("str2", "World");
        request.setAttribute("date", new Date());
        return "test02";
    }

    // 不同作用域
    @RequestMapping("/show3")
    public String show3(HttpServletRequest request) {

        request.setAttribute("msg1", "Message1");
        request.getSession().setAttribute("msg2", "Message2");
        request.getSession().getServletContext().setAttribute("msg3", "Message3");

        return "test03";
    }

}
