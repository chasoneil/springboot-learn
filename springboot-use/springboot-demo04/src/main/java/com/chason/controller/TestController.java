package com.chason.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/index")
    public String index(HttpServletRequest request) {

        request.setAttribute("msg", "Hello FreeMarker!");
        return "test1";
    }

}
