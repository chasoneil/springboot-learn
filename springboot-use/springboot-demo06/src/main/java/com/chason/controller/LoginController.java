package com.chason.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("/login")       // 测试拦截器不工作
    public String login() {
        return "login";
    }

    /**
     * 真正用于校验用户名密码的
     * @return
     */
    @PostMapping("/login1")
    public String login1(String username, String password, HttpServletRequest request) {
        // 如果登录成功，跳转首页
        if ("admin".equals(username) && "123456".equals(password)) {
            request.getSession().setAttribute("username", username);
            return "index";
        }

        request.setAttribute("msg", "用户名或密码错误！");
        return "redirect:/login";   // 重定向到login
    }

}
