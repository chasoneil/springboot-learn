package com.chason.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        // 如果用户登录成功则可以访问
        if (request.getSession().getAttribute("username") != null) {
            return true;
        }

        // 如果用户没有登录成功则不允许访问
        response.sendRedirect("/login");    // 重定向到登录页面
        return false;
    }
}
