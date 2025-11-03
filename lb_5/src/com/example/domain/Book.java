package com.example.domain;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book() {}

    public Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle (){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor (){
        return author;
    }

    public void setAuthor(String Author){
        this.author = author;
    }

    public int getYear (){
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void printInfo(){
        System.out.println("Название: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Год издания: " + year);
    }
}