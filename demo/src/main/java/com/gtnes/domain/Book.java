package com.gtnes.domain;

public class Book {
    private Integer id;
    private String name;
    private String author;
    private String publish;
    private String pages;
    private String price;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publish='" + publish + '\'' +
                ", pages='" + pages + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublish() {
        return publish;
    }

    public String getPages() {
        return pages;
    }

    public String getPrice() {
        return price;
    }
}
