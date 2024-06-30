package com.lut.project.mapper;

import com.lut.project.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    void update(User user);
}
