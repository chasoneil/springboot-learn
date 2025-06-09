package com.chason;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * 对controller的测试
 */
@SpringBootTest
@AutoConfigureMockMvc   // 只有增加了这个注解才能对controller进行测试
public class UserControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testFindUserById() throws Exception {

        // 构建请求
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/user/1")
                .accept(MediaType.APPLICATION_JSON);        // 执行请求的Accept头信息

        // 发送请求
        ResultActions perform = mockMvc.perform(request);

        // 校验请求结果
        perform.andExpect(MockMvcResultMatchers.status().isOk());

        // 执行完成返回结果
        MvcResult mvcResult = perform.andReturn();

        // 得到执行后的响应
        MockHttpServletResponse response = mvcResult.getResponse();

        System.out.println("响应状态:{}" + response.getStatus());
        System.out.println("响应内容:{}" + response.getContentAsString());
    }

    @BeforeEach
    void before(WebApplicationContext webApplicationContext) throws Exception {

        // 全局拦截，修改编码方式防止出现乱码
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext)
                .addFilter((request, response, chain) -> {
                    response.setCharacterEncoding("UTF-8");
                    chain.doFilter(request, response);
                }, "/*").build();

    }


}
