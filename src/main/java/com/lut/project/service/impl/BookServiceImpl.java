package com.lut.project.service.impl;

import com.lut.project.entity.Book;
import com.lut.project.entity.BookPage;
import com.lut.project.mapper.BookMapper;
import com.lut.project.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> selectAllBook() {

        return bookMapper.selectAllBook();
    }

    @Override
    public BookPage selectByPage(Integer pageNum, Integer pageSize, String bookName, String publisher) {

        int num = bookMapper.selectCount();
        List<Book> bookList = bookMapper.selectByNewPage((pageNum-1)*pageSize,pageSize,bookName,publisher);
        BookPage bookPage = new BookPage(num,bookList);
        return bookPage;
    }

    @Override
    public void save(Book book) {
        bookMapper.insert(book);
    }

    @Override
    public void update(Book book) {
        bookMapper.update(book);
    }

    @Override
    public void removeById(Integer id) {
        bookMapper.removeById(id);
    }

    @Override
    public void removeBatchByIds(List<Integer> ids) {
        bookMapper.removeBatchByIds(ids);
    }

    @Override
    public void updateNumber(int id, int bookNumber) {
        bookMapper.updateNumber(id,bookNumber);
    }
}
