package com.chason.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test2Controlller {

    /* 这里发生的错误， TestController中的exceptionHandler无法处理 */
    @ResponseBody
    @RequestMapping("/test2")
    public String test2() {
        int num = 1 / 0;
        return "Hello Test2";
    }

}
