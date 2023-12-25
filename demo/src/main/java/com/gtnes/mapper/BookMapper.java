package com.gtnes.mapper;

import com.gtnes.entity.Book;

public interface BookMapper {
    /*根据id查找*/
    Book FindBookById(String id) throws Exception;
}


