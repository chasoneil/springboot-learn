package com.chason.mapper;

import com.chason.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Mapper
 * @author chason
 */
public interface UserMapper {

    @Select("select * from tbl_user")   // 不写配置文件
    List<User> selectAllUsers();

}
