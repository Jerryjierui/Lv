package com.lut.project.controller;

import com.lut.project.entity.Result;
import com.lut.project.entity.User;
import com.lut.project.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping()
public class PageController {

    @Autowired
    private PageService pageService;


    //添加数据
    @PostMapping("/insert")
    public Result insert(){
        return Result.success();
    }

    @DeleteMapping("/delete")
    //删除数据
    public Result delete(){
        return Result.success("删除成功");
    }

    @PutMapping("/update")
    //更新数据
    public Result upDate(){
        return Result.success("数据已更新");
    }

    @GetMapping("/selectAll")
    //查找数据
    public Result select(){
        List<User> userList = pageService.selectAll();
        return Result.success(userList);
    }

}
