package com.example.pet;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(name + " лает.");
    }

    public void bite() {
        System.out.println(name + " кусает.");
    }
}