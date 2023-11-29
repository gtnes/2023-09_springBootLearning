package com.gtnes.dao;

import com.gtnes.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BookDaoTestCase {

    @Autowired
    private BookDao bookDao;

    // 单增加
    @Test
    void bookSave() {
        Book book = new Book();
        book.setName("数据库方法论");
        book.setAuthor("程序员");
        book.setPublish("机械出版社");
        book.setPages("660");
        book.setPrice("74");
        bookDao.insert(book);
    }

    // 单修改
    @Test
    void bookUpdate() {
        Book book = new Book();
        book.setId(122);
        book.setName("数据库方法论(第2版)");
        book.setAuthor("程序员");
        book.setPublish("机械出版社");
        book.setPages("690");
        book.setPrice("114");
        bookDao.updateById(book);
    }

    // 单删除
    @Test
    void bookDelete() {
        bookDao.deleteById(124);
    }

    // 单查询
    @Test
    void bookGetById() {
        // 普通写法
        System.out.println(bookDao.getById(1));
        // 使用baties Plus后的写法
        System.out.println(bookDao.selectById(2));
    }

    // 全查询
    @Test
    void bookGetAll() {
        // 使用baties Plus后的写法
        System.out.println(bookDao.selectList(null));
    }

    // 页查询
    @Test
    void bookGetPage() {
//        System.out.println(bookDao.selectPage(null, null));
    }

    // 条件查询
    @Test
    void bookGetBy() {
    }

}
