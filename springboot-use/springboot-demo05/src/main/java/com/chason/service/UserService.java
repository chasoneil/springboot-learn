package com.chason.service;

import com.chason.pojo.User;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface UserService {

    List<User> findAll();
    PageInfo<User> findAllUsers(int pageNum, int pageSize);

    User findById(int uid);
    int addUser(User user);
    int updateUser(User user);
    int deleteUser(int uid);

}
