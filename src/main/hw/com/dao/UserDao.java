package com.dao;

import com.pojo.UserInfo;

public interface UserDao {
    public UserInfo selectUserById(Integer userId);
}
