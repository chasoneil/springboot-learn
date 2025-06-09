package com.chason;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.chason.pojo.User;
import com.chason.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootDemo07ApplicationTests {

    @Autowired
    private UserService userService;

    /* 对mybatis-plus的数据库操作进行测试 */
    @Test
    void test01() {
        List<User> users = userService.list();
        for (User user : users) {
            System.out.println(user.getName());
        }
    }

    /* 带条件的数据查询 */
    @Test
    void test02 () {

        // 指定查询条件  queryWrapper -> 查询构造器
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("uname", "zs");

        List<User> users = userService.list(queryWrapper);
        for (User user : users) {
            System.out.println(user.getName());
        }
    }

    /* 多条件查询 */
    @Test
    void test03() {

        QueryWrapper<User> queryWrapper = new QueryWrapper<>();

        // 相当于 where A and B
        queryWrapper.eq("uname", "zhangsan").eq("uid", 3);

        List<User> users = userService.list(queryWrapper);
        for (User user : users) {
            System.out.println(user.getName());
        }

    }

    /* 单数据查询 */
    @Test
    void test04() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("uid", 3);
        User user = userService.getOne(queryWrapper);
        System.out.println(user.getName());
    }

    /* 新增数据 */
    @Test
    void test05() {
        User user = new User();
        user.setUid(4);
        user.setName("fox");
        user.setPassword("8jj");
        user.setRname("Fox");
        user.setIdentity(1);
        boolean save = userService.save(user);
        if (save) {
            System.out.println("增加用户成功");
        } else{
            System.out.println("增加用户失败");
        }
    }

    /* 修改信息 */
    @Test
    void test06() {

        // update from xxx set xxx where xxx
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("uid", 4);      // 这个其实就是where xxx

        User user = userService.getOne(queryWrapper);

        user.setRname("Jacky");
        boolean update = userService.update(user, queryWrapper);
        if (update) {
            System.out.println("修改用户信息成功");
        } else {
            System.out.println("修改用户信息失败");
        }
    }

    /* 删除用户信息 */
    @Test
    void test07() {

        // update from xxx set xxx where xxx
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("uid", 4);      // 这个其实就是where xxx

        boolean remove = userService.remove(queryWrapper);
        if (remove) {
            System.out.println("删除用户成功");
        } else {
            System.out.println("删除用户失败");
        }
    }

    /* 测试分页 */
    @Test
    void test08() {

        // 创建分页的基本参数类 类似设置pageNum pageSize
        Page<User> userPage = new Page<>(1, 3);

        // 分页的查询条件
        QueryWrapper<User> wrapper = new QueryWrapper<>();

        Page<User> page = userService.page(userPage, wrapper);
        List<User> users = page.getRecords();
        for (User user : users) {
            System.out.println(user.getName());
        }

        System.out.println("总页数:" + page.getPages());
        System.out.println("总记录数:" + page.getTotal());
        System.out.println("当前页码:" + page.getCurrent());
        System.out.println("每页数据:" + page.getSize());
    }

}
