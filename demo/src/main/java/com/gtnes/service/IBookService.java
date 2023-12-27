package com.gtnes.service;


import com.gtnes.entity.Book;

public interface IBookService {

    Book findBookById(String id) throws Exception;

}
