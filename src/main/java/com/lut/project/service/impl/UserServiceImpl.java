package com.lut.project.service.impl;

import com.lut.project.entity.Page;
import com.lut.project.entity.User;
import com.lut.project.entity.UserQueryParams;
import com.lut.project.mapper.UserMapper;
import com.lut.project.service.UserService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public void update(User user) {
        userMapper.update(user);
    }

    @Override
    public List<User> selectAllUser() {
        return userMapper.selectAllUser();
    }

    @Override
    public List<User> selectAllStudent() {
        return userMapper.selectAllStudent();
    }

    @Override
    public List<User> selectAllTeacher() {
        return userMapper.selectAllTeacher();
    }

    @Override
    public void removeBatchByIds(List<Integer> ids) {
        userMapper.removeBatchByIds(ids);
    }

    @Override
    public Page selectByPage(String role,int pageNum, int pageSize,String userName,String userPhone) {
        int num = userMapper.selectCount(role);
        List<User> list = userMapper.selectByNewPage((pageNum-1)*pageSize,pageSize,userName,userPhone,role);
        Page page = new Page(num,list);
        return page;
    }

    @Override
    public void save(User user) {
        userMapper.insert(user);
    }

    @Override
    public void removeById(Integer id) {
        userMapper.removeById(id);
    }

}
