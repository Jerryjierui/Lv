package com.lut.project.controller;

import com.lut.project.entity.Result;
import com.lut.project.entity.User;
import com.lut.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @PutMapping("/update")
    public Result update(@RequestBody User user){

        userService.update(user);

        return Result.success();
    }


}
