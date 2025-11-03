package com.example.pet;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("Имя животного: " + name);
    }

    public void run() {
        System.out.println(name + " бежит.");
    }
}