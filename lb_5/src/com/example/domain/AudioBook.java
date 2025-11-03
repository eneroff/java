package com.example.domain;

public class AudioBook extends Book {
    private int duration;

    public AudioBook(String title, String author, int year, int duration) {
        super(title, author, year);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Длительность: " + duration + " мин.");
    }
}