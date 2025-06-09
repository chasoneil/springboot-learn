package com.chason.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Spring Doc的配置类
 * 一定要配置该类 Spring doc才能生效
 */
@Configuration
public class SpringDocConfig {

    @Bean
    public OpenAPI restfulOpenAPI() {
        Info info = new Info().title("SpringBoot Demo05")
                .description("用户管理项目")
                .version("1.0.0");
        return new OpenAPI().info(info);
    }
}
