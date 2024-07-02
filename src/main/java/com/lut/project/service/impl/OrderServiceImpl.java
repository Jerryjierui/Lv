package com.lut.project.service.impl;

import com.lut.project.entity.Order;
import com.lut.project.mapper.OrderMapper;
import com.lut.project.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderMapper orderMapper;

    @Override
    public void insert(Order order) {
        orderMapper.insert(order);
    }
}
