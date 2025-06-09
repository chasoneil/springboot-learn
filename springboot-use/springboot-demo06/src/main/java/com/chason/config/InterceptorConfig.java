package com.chason.config;

import com.chason.interceptor.MyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 拦截器的配置
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Autowired
    private MyInterceptor myInterceptor;

    // 将拦截器注册
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        /* 当然我们也可以使用链式的写法 */
        InterceptorRegistration ir = registry.addInterceptor(myInterceptor);
        ir.addPathPatterns("/**");          // 对所有路径进行拦截
        ir.excludePathPatterns("/login");   // 对登录放行
    }
}
