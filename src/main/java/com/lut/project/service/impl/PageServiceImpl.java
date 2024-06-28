package com.lut.project.service.impl;

import com.lut.project.entity.User;
import com.lut.project.mapper.PageMapper;
import com.lut.project.service.PageService;
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
