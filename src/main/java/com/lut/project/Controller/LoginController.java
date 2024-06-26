package com.lut.project.Controller;

import cn.hutool.core.util.StrUtil;
import com.lut.project.Entity.AuthAccess;
import com.lut.project.Entity.Result;
import com.lut.project.Entity.User;
import com.lut.project.Service.LoginService;
import com.lut.project.Util.exception.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping()
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public Result login(@RequestBody User user){
        if(StrUtil.isBlank(user.getUserName()) || StrUtil.isBlank(user.getUserPassword())){
            return Result.error("数据不合法");
        }
        User dbUser = loginService.login(user);
        return Result.success(dbUser);
    }

    @AuthAccess
    @PostMapping("/register")
    public Result register(@RequestBody User user){
        if (StrUtil.isBlank(user.getUserName())
                || StrUtil.isBlank(user.getUserPassword())
                || StrUtil.isBlank(user.getRole())){
            return Result.error("数据不合法");
        }
        loginService.register(user);
        return Result.success("注册成功");
        }
    }
