package com.lut.project.service.impl;

import com.lut.project.entity.User;
import com.lut.project.mapper.LoginMapper;
import com.lut.project.service.LoginService;
import com.lut.project.util.tokenUtils.TokenUtils;
import com.lut.project.util.exception.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public User login(User user) {
        User dbUser = loginMapper.selectByUserName(user.getUserName());
        if (dbUser == null) {
            //抛出异常
            throw  new ServiceException("账号不存在");
        }
        if (!user.getUserPassword().equals(dbUser.getUserPassword())){
            //抛出异常
            throw  new ServiceException("密码错误");
        }
        String token = TokenUtils.createToken(dbUser.getId().toString(), dbUser.getUserPassword());
        dbUser.setToken(token);
        return dbUser;
    }

    @Override
    public void register(User user) {
        User dbUser = loginMapper.selectByUserName(user.getUserName());
        if (dbUser != null) {
            throw new ServiceException("账户已存在");
        }
        loginMapper.insertUser(user.getUserName(),user.getRole(),user.getUserPassword());
    }
}
