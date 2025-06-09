package com.chason.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component // 将拦截器加入容器
public class MyInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle拦截器执行");
        return true;    // 让拦截器生效
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle拦截器执行");
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    /* ... 里面还有其他的handle, 我们仅仅用preHandle做个Demo */

}
