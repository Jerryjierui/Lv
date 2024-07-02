package com.lut.project.service.impl;

import com.lut.project.mapper.OrderMapper;
import com.lut.project.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderMapper orderMapper;

}
