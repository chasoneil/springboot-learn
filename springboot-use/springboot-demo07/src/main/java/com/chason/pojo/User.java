package com.chason.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@TableName("tbl_user")      // 让表名和类名匹配
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

    private Integer uid;

    @TableField("uname")  // 让字段名匹配数据库的字段 （只能用于非主键字段）
    private String name;

    private String password;

    private String rname;

    private Integer identity;
}
