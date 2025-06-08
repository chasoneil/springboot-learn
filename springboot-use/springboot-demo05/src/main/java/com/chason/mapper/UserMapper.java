package com.chason.mapper;

import com.chason.pojo.User;

import java.util.List;

/**
 * 增删改查的基本方法
 */
public interface UserMapper {

    List<User> selectAllByPage();

    List<User> selectAll();

    User selectById(int id);

    int save(User user);

    int update(User user);

    int delete(int id);

}
