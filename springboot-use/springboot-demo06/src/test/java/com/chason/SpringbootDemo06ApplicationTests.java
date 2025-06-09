package com.chason;

import com.chason.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootDemo06ApplicationTests {

    @Autowired
    @Qualifier("s1")    // 指定对象（如果有多个相同的类型）
    private Student stu1;

    @Test
    void contextLoads() {
        System.out.println(stu1.toString());
    }

}
