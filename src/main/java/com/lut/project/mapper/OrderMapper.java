package com.lut.project.mapper;

import com.lut.project.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface OrderMapper {

    void insert(Order order);

    List<Order> selectAllOrder(int offset, Integer num, String bookName);


    int selectOrderCount();
    int selectPersonOrderCount(String buyerName);

    void deleteOrderById(int id);

    void update(Order order);

    List<Order> selectPersonOrder(int offset, Integer pageSize, String bookName, String buyerName);
}
