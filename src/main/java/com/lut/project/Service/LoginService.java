package com.lut.project.Service;

import com.lut.project.Entity.User;

public interface LoginService {
    User findUser(String userName,String userEmail,String userPassword);
    String login(User user);
    String register(User user);
}
