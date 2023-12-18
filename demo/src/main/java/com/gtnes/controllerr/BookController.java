package com.gtnes.controllerr;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.gtnes.controllerr.utils.Result;
import com.gtnes.domain.Book;
import com.gtnes.service.IBookService;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Rest模式
@RestController
// 通用访问前缀
@RequestMapping("/books")
public class BookController {

    // 注入业务层
    @Autowired
    private IBookService bookService;

    @GetMapping
    public Result getAll(){
        return new Result(true, bookService.list());
    }

    // http://localhost:8080/books/2
    @GetMapping("{id}")
    public Result getById(@PathVariable Integer id){
        return new Result(true, bookService.getById(id));
    }

    // @RequestBody: 接收前端传递的json字符串
    @PostMapping
    public Result save(@RequestBody Book book){
        return new Result(bookService.save(book));
    }

    @PutMapping
    public Result update(@RequestBody Book book){
        return new Result(bookService.updateById(book));
    }

    @DeleteMapping("{id}")
    public Result delete(@PathVariable Integer id){
        return new Result(true, bookService.removeById(id));
    }


    @GetMapping("{currentPage}/{pageSize}")
    public Result getPage(@PathVariable int currentPage, @PathVariable int pageSize){
        return new Result(true, bookService.getPage(currentPage, pageSize));

    }

}
