package com.chason.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chason.pojo.User;

/**
 * mybatis plus 帮我们封装好了增删改查了
 * 一些常见的封装好了，但是一些特殊的还是要自己写
 * 一些简单的CRUD， xml文件都不用写
 */
public interface UserMapper extends BaseMapper<User> {

}
