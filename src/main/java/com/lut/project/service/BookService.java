package com.lut.project.service;

import com.lut.project.entity.Book;
import com.lut.project.entity.BookPage;
import com.lut.project.entity.Page;

import java.util.List;

public interface BookService {

    public List<Book> selectAllBook();

    BookPage selectByPage(Integer pageNum, Integer pageSize, String bookName, String publisher);

    void save(Book book);

    void update(Book book);

    void removeById(Integer id);

    void removeBatchByIds(List<Integer> ids);

    void updateNumber(int id, int bookNumber);
}
