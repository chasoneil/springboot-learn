package com.chason.service;

import com.chason.pojo.User;
import java.util.List;

public interface UserService {

    List<User> findAllUsers();

    int delete(int uid);

}
