package com.chason.springbootdemo03.service;

import com.chason.springbootdemo03.mapper.StudentMapper;
import com.chason.springbootdemo03.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> findAllStudents() {
        return studentMapper.selectAllStudents();
    }
}
