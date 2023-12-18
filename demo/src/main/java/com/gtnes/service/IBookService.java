package com.gtnes.service;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.gtnes.domain.Book;

public interface IBookService extends IService<Book> {
    // 追加的操作与原始操作通过名称区分，功能类似
    boolean bookSave(Book book);
    boolean bookUpdate(Book book);
    boolean bookDelete(Integer id);
}
