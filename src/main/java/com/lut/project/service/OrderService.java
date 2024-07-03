package com.lut.project.service;

import com.lut.project.entity.Order;

import java.util.List;

public interface OrderService {

    void insert(Order order);

    List<Order> selectAllOrder(Integer pageNum, Integer pageSize, String bookName);

    int selectOrderCount();
    int selectPersonOrderCount(String buyerName);

    void deleteOrderById(int id);

    void deleteOrderByIds(List<Integer> ids);

    void update(Order order);

    List<Order> selectPersonOrder(Integer pageNum, Integer pageSize, String bookName, String buyerName);
}
