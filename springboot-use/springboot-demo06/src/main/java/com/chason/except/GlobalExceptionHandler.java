package com.chason.except;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 全局异常处理器，只要是controller中出现的异常问题都能处理
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = java.lang.ArithmeticException.class)
    public String myGlobalExceptionHandler() {
        System.out.println("GlobalExceptionHandler 处理问题");
        return "error/myError";
    }

}
