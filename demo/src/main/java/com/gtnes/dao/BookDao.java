package com.gtnes.dao;

import com.gtnes.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BookDao {
    @Select("select * from info_my where id = #{id}")
    public Book getById(Integer id);
}
