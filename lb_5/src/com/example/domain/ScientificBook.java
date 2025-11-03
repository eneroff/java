package com.example.domain;

public class ScientificBook extends Book {
    private String field;

    public ScientificBook(String title, String author, int year, String field) {
        super(title, author, year);
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Область науки: " + field);
    }
}