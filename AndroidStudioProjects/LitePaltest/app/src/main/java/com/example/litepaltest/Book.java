package com.example.litepaltest;

import org.litepal.crud.DataSupport;


public class Book extends DataSupport {
    private int id;
    private String author;
    private String name;
    private String press;
    private double price;
    private int pages;

    public int getId() {
        return id;
    }
    public String getAuthor() {
        return author;
    }
    public double getPrice(){
        return price;
    }
    public int getPages(){
        return pages;
    }
    public String getName() {
        return name;
    }
    public String getPress() {
        return press;
    }



    public void setId(int id) {
        this.id = id;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setPages(int pages){
        this.pages = pages;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPress(String press) {
        this.press = press;
    }
}
