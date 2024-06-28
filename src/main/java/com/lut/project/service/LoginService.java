package com.lut.project.service;

import com.lut.project.entity.User;

public interface LoginService {
    User login(User user);
    void register(User user);
}
