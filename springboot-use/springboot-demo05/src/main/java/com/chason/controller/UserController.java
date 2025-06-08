package com.chason.controller;

import com.chason.pojo.User;
import com.chason.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/user/{uid}")
    public User get(@PathVariable int uid) {
        return userService.findById(uid);
    }

    @RequestMapping("/user/list")
    @ResponseBody
    public List<User> findAll() {
        return userService.findAll();
    }

    @ResponseBody
    @GetMapping("/user/page")
    public PageInfo<User> findAllByPage(int pageNum,int pageSize) {
        return userService.findAllUsers(pageNum, pageSize);
    }

    @PostMapping("/user/add")
    @ResponseBody
    public int add(@RequestBody User user) {
        return userService.addUser(user);
    }

    @PutMapping("/user/update")
    @ResponseBody
    public int update(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @DeleteMapping("/user/del/{uid}")
    @ResponseBody
    public int delete(@PathVariable int uid) {
        return userService.deleteUser(uid);
    }
}
