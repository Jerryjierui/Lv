package com.lut.project.mapper;

import com.lut.project.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {
    void insertUser(String userName,String role,String userPassword);
    User searchUser(String userName, String userPassword);

    User selectByUserName(String userName);
}
