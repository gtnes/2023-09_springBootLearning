package com.gtnes.entity;
import lombok.Data;

/*
书籍 实体类
普通写法：需要写set和get方法
Lombok简写：Data为当前实体类自动添加get/set方法，toString方法，hashCode方法，equals方法等
@Getter Setter
*/

@Data
public class Book {
    private Integer id;
    /**书籍名称*/
    private String name;
    /**作者*/
    private String author;
    /**出版社*/
    private String publish;
    /**总页数*/
    private String pages;
    /**价格*/
    private String price;
}
