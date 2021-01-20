package com.sj.dao;


import com.sj.entity.User;

import java.util.List;

public interface UserDao {
    List<User> selectUser();

    List<User> selectUserByParam(User user);
}
