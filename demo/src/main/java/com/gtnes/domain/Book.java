package com.gtnes.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

// Lombok简写
//@Getter
//@Setter
// Data为当前实体类在编译期设置对应的get/set方法，toString方法，hashCode方法，equals方法等
@Data
public class Book {
    private Integer id;
    private String name;
    private String author;
    private String publish;
    private String pages;
    private String price;
}

// 普通写法：手动写get方法
//public class Book {
//    private Integer id;
//    private String name;
//    private String author;
//    private String publish;
//    private String pages;
//    private String price;
//
//    @Override
//    public String toString() {
//        return "Book{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", author='" + author + '\'' +
//                ", publish='" + publish + '\'' +
//                ", pages='" + pages + '\'' +
//                ", price='" + price + '\'' +
//                '}';
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public String getPublish() {
//        return publish;
//    }
//
//    public String getPages() {
//        return pages;
//    }
//
//    public String getPrice() {
//        return price;
//    }
//}
