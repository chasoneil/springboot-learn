package com.chason.controller;

import com.chason.pojo.User;
import com.chason.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user/list")
    @ResponseBody
    public List<User> findAll() {
        return userService.findAllUsers();
    }

    /* 新增事务处理 */
    @ResponseBody
    @DeleteMapping("/user/{uid}")
    @Transactional(propagation = Propagation.REQUIRED) // 使用注解表示这是一个事务
    public int deleteUserById(@PathVariable int uid) {
        int result = userService.delete(uid);

        // 加上事务之后，如果方法出现异常，整个方法都会回滚
        int a = 1/0;        // 模拟异常
        return result;
    }

}
