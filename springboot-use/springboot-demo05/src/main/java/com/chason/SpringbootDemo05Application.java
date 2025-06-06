package com.chason;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.chason.mapper")
public class SpringbootDemo05Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemo05Application.class, args);
        System.out.println("Springboot Demo05 started successfully!");
    }

}
