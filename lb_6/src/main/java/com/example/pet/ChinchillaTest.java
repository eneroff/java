package com.example.pet;

public class ChinchillaTest {
    public static void main(String[] args) {
        Chinchilla ch1 = new Chinchilla("Шуша", 2, 0.8, "серый");
        Chinchilla ch2 = new Chinchilla();

        ch1.speak();
        ch1.groom();
        ch1.goToSleep();

        ch2.setName("Пушинка");
        System.out.println("Имя второй шиншиллы: " + ch2.getName());
        ch2.speak();
    }
}