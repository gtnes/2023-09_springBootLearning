package com.gtnes.controllerr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Rest模式
@RestController
// 通用访问前缀
@RequestMapping("/books")
public class BookController {

    @GetMapping
    public String getById(){
        System.out.println("查询书籍信息20230928");
        return "查询书籍信息20230928";
    }

}
