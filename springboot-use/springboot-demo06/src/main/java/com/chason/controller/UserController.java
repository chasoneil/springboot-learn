package com.chason.controller;

import com.chason.pojo.User;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    /* 使用 validation进行校验 */
    @ResponseBody
    @PostMapping("/user")
    public int addUser(@RequestBody @Valid User user) {  // @Valid 表示开启校验，如果没有这个注解则校验不生效
        System.out.println("尝试新增用户到系统");
        System.out.println("新增用户成功");
        return 1;
    }
}
