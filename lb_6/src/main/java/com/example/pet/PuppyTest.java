package com.example.pet;

public class PuppyTest {
    public static void main(String[] args) {
        Puppy pup = new Puppy("Джери");

        pup.printName();
        pup.bark();
        pup.jump();
        pup.run();
        pup.bite();
    }
}