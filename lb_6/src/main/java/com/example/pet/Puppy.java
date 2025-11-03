package com.example.pet;

public class Puppy extends Dog {

    public Puppy(String name) {
        super(name);
    }

    public void jump() {
        System.out.println(name + " прыгает.");
    }
}