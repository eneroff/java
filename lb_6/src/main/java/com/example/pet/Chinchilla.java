package com.example.pet;

public class Chinchilla {
    private String name;
    private int age;
    protected double weight;
    public String color;

    public Chinchilla(String name, int age, double weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public Chinchilla() {
        this.name = "Безымянная";
        this.age = 0;
        this.weight = 0.0;
        this.color = "неизвестный";
    }

    public void speak() {
        System.out.println(name + " пищит!");
    }

    private void sleep() {
        System.out.println(name + " спит...");
    }

    protected void groom() {
        System.out.println(name + " чистит шерстку.");
    }

    public void goToSleep() {
        sleep();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}