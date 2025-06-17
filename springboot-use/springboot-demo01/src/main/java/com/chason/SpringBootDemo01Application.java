package com.chason;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // 只有加入注解才是启动类
public class SpringBootDemo01Application {

    public static void main(String[] args) {
        /*
            扫描器会扫描配置的class(启动器)的同包以及子包的路径，如果有注解配置都会装配
            所以这个启动类要放在最外面
         */
        SpringApplication.run(SpringBootDemo01Application.class, args);
        System.out.println("Demo01 Springboot started!");
    }

}
