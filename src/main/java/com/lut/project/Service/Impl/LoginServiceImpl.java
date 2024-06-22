package com.lut.project.Service.Impl;

import com.lut.project.Entity.User;
import com.lut.project.Mapper.LoginMapper;
import com.lut.project.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public User findUser(String userName, String userEmail, String userPassword) {
        return null;
    }

    @Override
    public String login(User user) {
        User user1 = loginMapper.searchUser(user.getUserEmail(), user.getUserPassword());
        if (user1 == null) {
            return "登录失败";
        } else {
            return "登录成功";
        }

    }

    @Override
    public String register(User user) {
        User user1 = loginMapper.findUser(user.getUserName(), user.getUserEmail());
        if (user1 != null) {
            if (user1.getUserName() != null) {
                return "用户名已存在";
            } else if (user1.getUserEmail() != null) {
                return "邮箱已注册";
            }
        }
        loginMapper.insertUser(user.getUserName(),user.getUserEmail(),user.getUserPassword());
        return "注册成功";
    }
}
