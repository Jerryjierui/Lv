package com.lut.project.service.impl;

import com.lut.project.entity.Order;
import com.lut.project.mapper.OrderMapper;
import com.lut.project.mapper.UserMapper;
import com.lut.project.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderMapper orderMapper;

    @Override
    public void insert(Order order) {
        orderMapper.insert(order);
    }

    @Override
    public List<Order> selectAllOrder(Integer pageNum, Integer pageSize, String bookName) {
        List<Order> list= orderMapper.selectAllOrder((pageNum-1)*pageSize,pageSize,bookName);
        return list;
    }

    @Override
    public int selectOrderCount() {
        return orderMapper.selectOrderCount();
    }

    @Override
    public int selectPersonOrderCount(String buyerName) {
        return orderMapper.selectPersonOrderCount(buyerName);
    }

    @Override
    public void deleteOrderById(int id) {
        orderMapper.deleteOrderById(id);
    }

    @Override
    public void deleteOrderByIds(List<Integer> ids) {
        for(Integer id:ids){
            orderMapper.deleteOrderById(id);
        }
    }

    @Override
    public void update(Order order) {
        orderMapper.update(order);
    }

    @Override
    public List<Order> selectPersonOrder(Integer pageNum, Integer pageSize, String bookName, String buyerName) {
        List<Order> list= orderMapper.selectPersonOrder((pageNum-1)*pageSize,pageSize,bookName,buyerName);
        return list;
    }
}
