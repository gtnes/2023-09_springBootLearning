package com.gtnes.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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

    // 分页查询
    @Test
    void bookGetPage() {
        IPage page = new Page(1, 5);
        bookDao.selectPage(page, null);
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.getPages()); // 最大页码值
        System.out.println(page.getRecords());
    }

    // 条件查询1
    @Test
    void bookGetBy1() {
        // 这种写法如果name写错会直接报错
        QueryWrapper<Book> qw = new QueryWrapper<Book>();
        qw.like("name", "入门");
        bookDao.selectList(qw);
    }

    // 条件查询2
    @Test
    void bookGetBy2() {
        // name为null时不会连接查询条件，及查询所有
        String name = "入门";
//        String name = null;
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<Book>();
        lqw.like(name != null, Book::getName, name);
        bookDao.selectList(lqw);
    }

}
