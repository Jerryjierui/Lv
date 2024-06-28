package com.lut.project.controller;

import com.lut.project.entity.Book;
import com.lut.project.entity.Result;
import com.lut.project.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/selectAllBook")
    public Result selectAllBook(){

        List<Book> bookList = bookService.selectAllBook();

        return Result.success(bookList);
    }

}
