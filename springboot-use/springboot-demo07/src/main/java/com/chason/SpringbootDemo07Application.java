package com.chason;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.chason.mapper")
public class SpringbootDemo07Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemo07Application.class, args);
    }

}
