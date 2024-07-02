package com.lut.project.mapper;

import com.lut.project.entity.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {

    List<Book> selectAllBook();

    int selectCount();

    List<Book> selectByNewPage(int offset, int num, String bookName, String publisher);

    void insert(Book book);

    void update(Book book);

    void removeById(Integer id);

    void removeBatchByIds(List<Integer> ids);

    void updateNumber(int id, int bookNumber);
}
