package com.gtnes.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gtnes.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

//@Mapper
//public interface BookDao {
//    @Select("select * from book where id = #{id}")
//    public Book getById(Integer id);
//}

// 使用baties Plus后的简易写法
@Mapper
public interface BookDao extends BaseMapper<Book> {
}

