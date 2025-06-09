package com.chason.mapper;

import com.chason.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Mapper
 * @author chason
 */
public interface UserMapper {

    // 当没有配置文件的时候，使用注解也是可以的
    // @Select("select * from tbl_user")

    List<User> selectAllUsers();

    int deleteUser(int uid);

}
