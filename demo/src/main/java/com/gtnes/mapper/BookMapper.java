package com.gtnes.mapper;

import com.gtnes.entity.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookMapper {
    /*根据id查找*/
    Book findBookById(String id) throws Exception;
}


