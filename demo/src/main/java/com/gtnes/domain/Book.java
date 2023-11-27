package com.gtnes.domain;

public class Book {
    private Integer id;
    private String name;
    private String gender;
    private String year;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", year='" + year + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getYear() {
        return year;
    }
}
