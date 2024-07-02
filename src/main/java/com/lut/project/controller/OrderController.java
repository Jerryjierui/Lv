package com.lut.project.controller;

import com.lut.project.entity.Order;
import com.lut.project.entity.Result;
import com.lut.project.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("/submit")
    public Result submit(@RequestBody Order order){
        orderService.insert(order);
        return Result.success();
    }

}
