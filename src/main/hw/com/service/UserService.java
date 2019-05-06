package com.service;

import com.pojo.UserInfo;

public interface UserService {
    UserInfo selectUserById(Integer userId);
}
