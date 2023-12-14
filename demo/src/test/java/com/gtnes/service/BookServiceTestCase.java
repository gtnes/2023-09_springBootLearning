package com.gtnes.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gtnes.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTestCase {

    @Autowired
    private IBookService bookService;

    @Test
    void testGetById() {
        System.out.println(bookService.getById(2));
    }

    @Test
    void bookSave() {
        Book book = new Book();
        book.setName("数据库方法论(2020)");
        book.setAuthor("程序员");
        book.setPublish("机械出版社");
        book.setPages("660");
        book.setPrice("74");
        bookService.save(book);
    }

    // 单修改
    @Test
    void bookUpdate() {
        Book book = new Book();
        book.setId(122);
        book.setName("数据库方法论(第3版)");
        book.setAuthor("程序员");
        book.setPublish("机械出版社");
        book.setPages("690");
        book.setPrice("114");
        bookService.updateById(book);
    }

    // 单删除
    @Test
    void bookDelete() {
        bookService.removeById(124);
    }

    // 单查询
    @Test
    void bookGetById() {
        // 普通写法
        System.out.println(bookService.getById(1));
    }

    // 全查询
    @Test
    void bookGetAll() {
        // 使用baties Plus后的写法
        System.out.println(bookService.list());
    }

    // 分页查询
    @Test
    void getPage() {
        IPage<Book> page = new Page<Book>(1, 5);
        bookService.page(page);
        System.out.println(page.getCurrent());
        System.out.println(page.getPages());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.getRecords());
    }
}
