package com.chason.service;

import com.chason.pojo.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
    User findById(int uid);
    int addUser(User user);
    int updateUser(User user);
    int deleteUser(int uid);

}
