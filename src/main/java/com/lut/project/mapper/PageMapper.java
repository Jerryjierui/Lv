package com.lut.project.mapper;

import com.lut.project.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PageMapper {
    List<User> selectAll();
    User selectById(int id);
    User selectByName();
    int selectPhone();
    List<User> deleteById();

}
