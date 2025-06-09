package com.chason.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chason.mapper.UserMapper;
import com.chason.pojo.User;
import org.springframework.stereotype.Service;

/**
 * 如果仅仅是实现UserService 那么你需要重写一大堆的抽象方法接口
 * Mybatis-plus提供ServiceImpl类将这些方法全部都重写了
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
