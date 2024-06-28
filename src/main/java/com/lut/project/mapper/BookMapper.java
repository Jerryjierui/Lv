package com.lut.project.mapper;

import com.lut.project.entity.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {

    List<Book> selectAllBook();

}
