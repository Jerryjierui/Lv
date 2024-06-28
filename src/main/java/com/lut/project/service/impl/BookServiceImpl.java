package com.lut.project.service.impl;

import com.lut.project.entity.Book;
import com.lut.project.mapper.BookMapper;
import com.lut.project.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> selectAllBook() {

        return bookMapper.selectAllBook();
    }
}
