package com.chason.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table tbl_user;
 */
/* 创建无参和所有参数的构造器 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    private int uid;
    private String uname;
    private String password;
    private String rname;
    private int identity;
}
