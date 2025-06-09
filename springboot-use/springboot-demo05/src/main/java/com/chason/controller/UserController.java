package com.chason.controller;

import com.chason.pojo.User;
import com.chason.service.UserService;
import com.github.pagehelper.PageInfo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "用户管理模块", description = "用户模块接口的定义")
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/user/{uid}")
    @Operation(summary = "根据用户ID查询用户信息")
    @Parameter(name = "uid", description = "用户uid", required = true)    // 只有一个参数使用@Parameter
    public User get(@PathVariable int uid) {
        return userService.findById(uid);
    }

    @RequestMapping("/user/list")
    @ResponseBody
    @Operation(summary = "查询所有用户信息")
    public List<User> findAll() {
        return userService.findAll();
    }

    @ResponseBody
    @GetMapping("/user/page")
    @Operation(summary = "查询所有用户信息并分页")
    @Parameters({       // 如果有多个参数则使用 @Parameters
            @Parameter(name = "pageNum", description = "页码", required = true),
            @Parameter(name = "pageSize", description = "每页数据量", required = true)
    })
    public PageInfo<User> findAllByPage(int pageNum,int pageSize) {
        return userService.findAllUsers(pageNum, pageSize);
    }

    @PostMapping("/user/add")
    @ResponseBody
    @Operation(summary = "新增用户")
    @Parameter(name = "user", description = "新增的用户类", required = true)
    public int add(@RequestBody User user) {
        return userService.addUser(user);
    }

    @PutMapping("/user/update")
    @ResponseBody
    @Operation(summary = "更新用户信息")
    @Parameter(name = "user", description = "更新的用户信息", required = true)
    public int update(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @DeleteMapping("/user/del/{uid}")
    @ResponseBody
    @Operation(summary = "根据用户ID删除用户信息")
    @Parameter(name = "uid", description = "用户id", required = true)
    public int delete(@PathVariable int uid) {
        return userService.deleteUser(uid);
    }
}
