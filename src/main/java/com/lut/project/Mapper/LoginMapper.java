package com.lut.project.Mapper;

import com.lut.project.Entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {
    void insertUser(String userName,String userEmail,String userPassword);
    User findUser(String userName,String userEmail);
    User searchUser(String userEmail, String userPassword);
}
