package com.chason.except;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * 这也是一种springboot中提供给我们的异常处理机制
 * 但是用的比较少
 */
public class MyExceptionHandler implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest request,
                                         HttpServletResponse response, Object handler, Exception ex) {
        /*ModelAndView modelAndView = new ModelAndView();
        if (ex instanceof ArithmeticException) {
            modelAndView.setViewName("error/myError");
        }
        return modelAndView;*/
        return null;
    }
}
