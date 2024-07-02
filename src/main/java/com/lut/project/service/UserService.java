package com.lut.project.service;

import com.lut.project.entity.Page;
import com.lut.project.entity.User;
import com.lut.project.entity.UserQueryParams;

import java.util.List;

public interface UserService {
   public void update(User user);
    List<User> selectAllUser();

    List<User> selectAllStudent();
    List<User> selectAllTeacher();

    void removeBatchByIds(List<Integer> ids);

    Page selectByPage(String role,int pageNum, int pageSize,String userName,String userPhone);

    void save(User user);

 void removeById(Integer id);


}
