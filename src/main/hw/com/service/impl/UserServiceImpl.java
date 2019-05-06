package com.service.impl;

import com.mapper.UserInfoMapper;
import com.pojo.UserInfo;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoMapper mapper;

    public UserInfo selectUserById(Integer userId) {
        return mapper.selectByPrimaryKey(userId);
    }
}
