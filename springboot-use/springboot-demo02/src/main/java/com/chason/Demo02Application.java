package com.chason;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.chason.mapper")    // 扫描 com.chason.mapper 下的所有文件加入容器中
public class Demo02Application {

    public static void main( String[] args ) {
        SpringApplication.run(Demo02Application.class, args);
        System.out.println("Start Springboot demo02!");
    }

}
