package com.chason.config;

import com.chason.pojo.Clazz;
import com.chason.pojo.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Springboot可以通过这个类来构建Bean
 * 类似于Spring中使用 applicationContext.xml中 <bean><bean/>标签的配置
 */
@Configuration
public class BeanConfiguration {

    @Bean  // 如果使用@Bean("s1") 这样等于给对象起了个名字 如果不写则用方法默认的getxxx为名
    public Student getStu() {
        Student s = new Student();
        s.setId(1);
        s.setName("张三");
        s.setClazz(null);
        return s;
    }

    /* 通过在方法中传参的形式可以实现对象的注入，但是这个被注入的对象必须也要注册到容器中 */
    @Bean("s1")
    public Student getStu1(@Qualifier("c2") Clazz clazz) {  // 通过 @Qualifier 决定注入的班级对象
        Student s1 = new Student();
        s1.setId(2);
        s1.setName("李四");
        s1.setClazz(clazz);
        return s1;
    }

    @Bean
    public Clazz getCla() {
        Clazz c1 = new Clazz();
        c1.setId(101);
        c1.setName("一年级1班");
        return c1;
    }

    @Bean("c2")
    public Clazz getCla1() {
        Clazz c2 = new Clazz();
        c2.setId(102);
        c2.setName("一年级2班");
        return c2;
    }

}
