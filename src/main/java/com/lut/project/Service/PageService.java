package com.lut.project.Service;

import com.lut.project.Entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface PageService {

    public List<User> selectAll();
}
