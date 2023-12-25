package com.gtnes.service;


import com.gtnes.entity.Book;

public interface IBookService {

    Book FindBookById(String id) throws Exception;

}
