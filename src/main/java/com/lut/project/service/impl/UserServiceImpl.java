package com.lut.project.service.impl;

import com.lut.project.entity.User;
import com.lut.project.mapper.UserMapper;
import com.lut.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public void update(User user) {
        userMapper.update(user);
    }
}
