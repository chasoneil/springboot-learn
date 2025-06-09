package com.chason.pojo;

import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

public class User {

    private int id;

    // 用户名不能为空
    @NotBlank(message = "用户名不能为空")
    private String username;

    @NotBlank(message = "密码不能为空")
    @Length(min = 6, max = 10, message = "密码长度至少是6位但不能超过10位")
    private String password;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
