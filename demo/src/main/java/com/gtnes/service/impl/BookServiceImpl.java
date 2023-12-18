package com.gtnes.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gtnes.dao.BookDao;
import com.gtnes.domain.Book;
import com.gtnes.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl extends ServiceImpl<BookDao, Book> implements IBookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public boolean bookSave(Book book) {
        return bookDao.insert(book) > 0;
    }

    @Override
    public boolean bookUpdate(Book book) {
        return bookDao.updateById(book) > 0;
    }

    @Override
    public boolean bookDelete(Integer id) {
        return bookDao.deleteById(id) > 0;
    }
    public IPage<Book> getPage(int currentPage, int pageSize) {
        IPage page = new Page(currentPage, pageSize);
        bookDao.selectPage(page, null);
        return page;
    }

}
