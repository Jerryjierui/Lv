package com.lut.project.Controller;

import com.lut.project.Entity.Result;
import com.lut.project.Entity.User;
import com.lut.project.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public Result login(@RequestBody User user){

        String login = loginService.login(user);
        if(login.equals("登录失败")){
            return Result.error("用户名或密码错误");
        }
        return Result.success();
    }

    @PostMapping("/register")
    public Result register(@RequestBody User user){
        String register = loginService.register(user);
        if (register.equals("用户名和邮箱已存在")){
            return  Result.error("用户名和邮箱已存在");
        }else {
            return Result.success();
        }
    }


}
