package com.lut.project.controller;

import com.lut.project.entity.Order;
import com.lut.project.entity.OrderPage;
import com.lut.project.entity.Result;
import com.lut.project.service.OrderService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    /**
     * 查看所有订单
     * @param pageNum
     * @param pageSize
     * @param bookName
     * @return
     */
    @GetMapping("/selectAllOrder")
    public Result selectAllOrder(Integer pageNum,
                                 Integer pageSize,
                                 @RequestParam(required = false) String bookName
                                 ){
        List<Order> list = orderService.selectAllOrder(pageNum,pageSize,bookName);
        int total = orderService.selectOrderCount();
        OrderPage orderPage = new OrderPage(total,list);
        return Result.success(orderPage);
    }

    @GetMapping("/selectPersonOrder")
    public Result selectPersonOrder(Integer pageNum,
                                 Integer pageSize,
                                 @RequestParam(required = false) String bookName,
                                    @RequestParam(required = false) String buyerName
    ){
        List<Order> list = orderService.selectPersonOrder(pageNum,pageSize,bookName,buyerName);
        int total = orderService.selectPersonOrderCount(buyerName);
        OrderPage orderPage = new OrderPage(total,list);
        return Result.success(orderPage);
    }

    @DeleteMapping("/deleteOrderByOrder")
    public Result deleteOrderById(int id){
        orderService.deleteOrderById(id);
        return Result.success();
    }


    /**
     * 批量删除
     * @param ids
     * @return
     */
    @DeleteMapping("/deleteOrderByIds")
    public Result deleteOrderById(@RequestBody List<Integer> ids){
        for (Integer id:ids){
            System.out.println(id);
        }
        orderService.deleteOrderByIds(ids);
        return Result.success();
    }

    /**
     * 更改订单数据
     */
    @PutMapping("/update")
    public Result update(@RequestBody Order order){

        orderService.update(order);
        return Result.success();
    }

}
