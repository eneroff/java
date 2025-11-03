package com.example.domain;

public class PrintedBook extends Book {
    private int pages;

    public PrintedBook(String title, String author, int year, int pages) {
        super(title, author, year);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Количество страниц: " + pages);
    }
}