package com.chason;

import com.chason.pojo.User;
import com.chason.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootDemo07ApplicationTests {

    @Autowired
    private UserService userService;

    /* 对mybatis-plus的数据库操作进行测试 */
    @Test
    void contextLoads() {

        List<User> users = userService.list();
        for (User user : users) {
            System.out.println(user.getName());
        }

    }

}
