package com.chason.service;

import com.chason.mapper.UserMapper;
import com.chason.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    /**
     * 这里userMapper报红是因为整个容器中找不到UserMapper,解决的方法有两个
     * 1. 在UserMapper上加上@Mapper注解，但是这种方式只会对UserMapper一个类生效
     * 2. 在启动类上添加注解@MapperScan() 扫描路径下的所有Mapper
     */
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAllUsers() {
        return userMapper.selectAllUsers();
    }

    @Override
    public int delete(int uid) {
        return userMapper.deleteUser(uid);
    }
}
