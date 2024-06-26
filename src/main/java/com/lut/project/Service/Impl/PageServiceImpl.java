package com.lut.project.Service.Impl;

import com.lut.project.Entity.User;
import com.lut.project.Mapper.PageMapper;
import com.lut.project.Service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PageServiceImpl implements PageService {

    @Autowired
    private PageMapper pageMapper;

    @Override
    public List<User> selectAll() {
        return pageMapper.selectAll();
    }
}
