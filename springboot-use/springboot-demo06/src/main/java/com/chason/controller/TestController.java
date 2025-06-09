package com.chason.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @ResponseBody
    @RequestMapping("/msg")
    public String message() {
        int a = 1/0;    //模拟异常
        return "Hello Spring Page.";
    }

    // 局部的异常处理,这个异常处理只能收到当前类的异常
    @ExceptionHandler(value = {java.lang.ArithmeticException.class}) // 出现指定的异常就会进入这个逻辑
    public String myExceptionHandler() {
        System.out.println("执行异常处理的逻辑");
        return "error/myError";   // 返回指定的页面
    }

}
