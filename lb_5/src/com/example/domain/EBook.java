package com.example.domain;

public class EBook extends Book {
    private double fileSize;

    public EBook(String title, String author, int year, double fileSize) {
        super(title, author, year);
        this.fileSize = fileSize;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Размер файла: " + fileSize + " MB");
    }
}