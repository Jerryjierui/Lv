package com.lut.project.mapper;

import com.lut.project.entity.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {

    void insert(Order order);
}
