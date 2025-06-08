package com.chason.service;

import com.chason.mapper.UserMapper;
import com.chason.pojo.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.selectAll();
    }

    @Override
    public PageInfo<User> findAllUsers(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<User> users = userMapper.selectAllByPage();
        PageInfo<User> info = new PageInfo<>(users);
        return info;
    }

    @Override
    public User findById(int uid) {
        return userMapper.selectById(uid);
    }

    @Override
    public int addUser(User user) {
        return userMapper.save(user);
    }

    @Override
    public int updateUser(User user) {
        if (user.getUid() == 0) {
            throw new RuntimeException("uid need to be set");
        }

        User oldUser = userMapper.selectById(user.getUid());
        if (oldUser == null) {
            throw new RuntimeException("User " + user.getUname() + " not exist");
        }

        compareAndSetUser(oldUser, user);
        return userMapper.update(user);
    }

    @Override
    public int deleteUser(int uid) {
        return userMapper.delete(uid);
    }

    private User compareAndSetUser(User oldUser, User newUser) {
        if (newUser.getUname() == null) {
            newUser.setUname(oldUser.getUname());
        }

        if (newUser.getRname() == null) {
            newUser.setRname(oldUser.getRname());
        }

        if (newUser.getPassword() == null) {
            newUser.setPassword(oldUser.getPassword());
        }

        if (newUser.getIdentity() == 0) {
            newUser.setIdentity(oldUser.getIdentity());
        }

        return newUser;
    }
}
