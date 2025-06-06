package com.chason.springbootdemo03.service;

import com.chason.springbootdemo03.pojo.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAllStudents();

}
