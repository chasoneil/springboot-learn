package com.chason.springbootdemo03.mapper;

import com.chason.springbootdemo03.pojo.Student;

import java.util.List;

public interface StudentMapper {

    List<Student> selectAllStudents();

}
