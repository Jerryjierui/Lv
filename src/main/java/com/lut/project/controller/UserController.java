package com.lut.project.controller;

import com.lut.project.entity.Page;
import com.lut.project.entity.Result;
import com.lut.project.entity.User;
import com.lut.project.entity.UserQueryParams;
import com.lut.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    /**
     * 新增用户信息
     */
    @PostMapping("/add")
    public Result add(@RequestBody User user) {
        try {
            userService.save(user);
        } catch (DuplicateKeyException e) {
            throw new DuplicateKeyException("插入数据库错误");
        } catch (Exception e) {
            throw new RuntimeException("系统错误");
        }
        return Result.success();
    }

    /**
     * 更新数据
     * @param user
     * @return
     */
    @PutMapping("/update")
    public Result update(@RequestBody User user){

        userService.update(user);
        return Result.success();
    }

    /**
     * 显示所有用户信息
     */
    @GetMapping("/selectAllUser")
    public Result selectAllUser(){
        List<User> userList = userService.selectAllUser();
        return Result.success(userList);
    }

    /**
     * 显示所有学生信息
     */
    @GetMapping("/selectAllStudent")
    public Result selectAllStudent(){
        List<User> userList = userService.selectAllStudent();
        return Result.success(userList);
    }

    /**
     * 显示所有教师信息
     */
    @GetMapping("/selectAllTeacher")
    public Result selectAllTeacher(){
        List<User> userList = userService.selectAllTeacher();
        return Result.success(userList);
    }

    /**
     * 删除用户信息
     */
    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id) {
        userService.removeById(id);
        return Result.success();
    }


    /**
     * 批量删除用户信息
     */
    @DeleteMapping("/delete/batch")
    public Result batchDelete(@RequestBody List<Integer> ids) {
        userService.removeBatchByIds(ids);
        return Result.success();
    }

    /**
     * 多条件模糊查询用户信息
     * pageNum 当前的页码
     * pageSize 每页查询的个数
     */
    @GetMapping("/selectByPage")
    public Result selectByPage( String role,
                                Integer pageNum,
                                Integer pageSize,
                               @RequestParam(required = false) String username,
                               @RequestParam(required = false) String userPhone) {
        //UserQueryParams params = new UserQueryParams(pageNum,pageSize,userName, userPhone);

        Page page = userService.selectByPage(role,pageNum, pageSize,username,userPhone);
        return Result.success(page);
    }


}
