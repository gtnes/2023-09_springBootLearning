package com.gtnes.service.impl;

import com.gtnes.entity.Book;
import com.gtnes.mapper.BookMapper;
import com.gtnes.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements IBookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public Book FindBookById(String id) throws Exception {
        return bookMapper.findBookById(id);
    }

}
