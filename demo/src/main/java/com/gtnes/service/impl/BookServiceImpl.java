package com.gtnes.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gtnes.dao.BookDao;
import com.gtnes.domain.Book;
import com.gtnes.service.IBookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl extends ServiceImpl<BookDao, Book> implements IBookService {

}
