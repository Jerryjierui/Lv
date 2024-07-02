package com.lut.project.controller;

import com.lut.project.entity.Book;
import com.lut.project.entity.BookPage;
import com.lut.project.entity.Page;
import com.lut.project.entity.Result;
import com.lut.project.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
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

    /**
     * 新增教材信息
     */
    @PostMapping("/add")
    public Result add(@RequestBody Book book) {
        try {
            bookService.save(book);
        } catch (DuplicateKeyException e) {
            throw new DuplicateKeyException("插入数据库错误");
        } catch (Exception e) {
            throw new RuntimeException("系统错误");
        }
        return Result.success();
    }

    /**
     * 更新数据
     * @param book
     * @return
     */
    @PutMapping("/update")
    public Result update(@RequestBody Book book){

        bookService.update(book);
        return Result.success();
    }

    /**
     * 更新教材数量
     */
    @PutMapping("/updateNumber")
    public Result updateNumber(int id,int bookNumber){
        bookService.updateNumber(id,bookNumber);
        return Result.success();
    }

    /**
     * 删除用户信息
     */
    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id) {
        bookService.removeById(id);
        return Result.success();
    }


    /**
     * 批量删除用户信息
     */
    @DeleteMapping("/delete/batch")
    public Result batchDelete(@RequestBody List<Integer> ids) {
        bookService.removeBatchByIds(ids);
        return Result.success();
    }

    /**
     * 多条件模糊查询用户信息
     * pageNum 当前的页码
     * pageSize 每页查询的个数
     */
    @GetMapping("/selectByPage")
    public Result selectByPage( Integer pageNum,
                                Integer pageSize,
                                @RequestParam(required = false) String bookName,
                                @RequestParam(required = false) String publisher) {
        BookPage bookPage = bookService.selectByPage(pageNum, pageSize,bookName,publisher);
        return Result.success(bookPage);
    }

}
