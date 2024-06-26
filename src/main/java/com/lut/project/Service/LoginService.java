package com.lut.project.Service;

import com.lut.project.Entity.User;

public interface LoginService {
    User login(User user);
    void register(User user);
}
