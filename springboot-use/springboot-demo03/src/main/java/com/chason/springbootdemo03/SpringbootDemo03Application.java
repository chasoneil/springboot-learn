package com.chason.springbootdemo03;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.chason.springbootdemo03.mapper")
public class SpringbootDemo03Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemo03Application.class, args);
        System.out.println("== Springboot demo03 started successfully! ==");
    }

}
