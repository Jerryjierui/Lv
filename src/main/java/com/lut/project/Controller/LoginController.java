package com.lut.project.Controller;

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
    public String login(@RequestBody User user){
        String login = loginService.login(user);
        return login;
    }

    @PostMapping("/register")
    public String register(@RequestBody User user){
        String register = loginService.register(user);
        return register;
    }


}
