package com.gtnes.service;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.gtnes.domain.Book;

public interface IBookService extends IService<Book> {

    IPage<Book> getPage(int currentPage, int pageSize);

}
