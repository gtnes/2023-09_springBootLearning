package com.gtnes.controllerr;

import com.gtnes.controllerr.utils.Result;
import com.gtnes.entity.Book;
import com.gtnes.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// Rest模式
@RestController
// 通用访问前缀
@RequestMapping("/books")
public class BookController {

    // 注入业务层
    @Autowired
    private IBookService bookService;

    @GetMapping("/findBookById")
    public Result findBookById(@RequestParam String id) throws Exception {

//        return new Result(true,bookService .FindBookById(id));
        return Result.ok(bookService.FindBookById(id));
    }
}
