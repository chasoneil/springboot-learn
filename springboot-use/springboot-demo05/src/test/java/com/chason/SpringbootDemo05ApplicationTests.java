package com.chason;

import com.chason.service.UserService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootDemo05ApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
        System.out.println(userService.findById(1));
    }

    // 测试之前做的操作
    @BeforeEach
    public void before() {
        System.out.println("before test do");
    }

    // 测试之后做的操作
    @AfterEach
    public void after() {
        System.out.println("after test do");
    }

}
