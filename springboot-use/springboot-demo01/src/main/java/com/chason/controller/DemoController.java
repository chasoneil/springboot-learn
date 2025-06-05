package com.chason.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 测试控制器
 */
@Controller
public class DemoController {

    @ResponseBody
    @RequestMapping("/index")
    public String index() {
        return "Hello Springboot ~";
    }

}
