package com.lut.project.entity;

import lombok.Data;

@Data
public class Book {
    private int Id;
    private String bookName;
    private String cover;
    private String description;
    private String author;
    private String publisher;
    private int price;
    private int bookNumber;
    private String classify;


}
