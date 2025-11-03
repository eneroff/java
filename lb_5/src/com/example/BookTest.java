package com.example;

import com.example.domain.*;

public class BookTest {
    public static void main(String[] args) {
        EBook ebook = new EBook("Java Basics", "Иванов И.И.", 2021, 5.6);
        PrintedBook pbook = new PrintedBook("Война и мир", "Л.Н. Толстой", 1869, 1300);
        AudioBook abook = new AudioBook("Гарри Поттер", "Дж. Роулинг", 2001, 720);
        ScientificBook sbook = new ScientificBook("Физика", "А.А. Петров", 2019, "Теоретическая физика");

        System.out.println("=== Электронная книга ===");
        ebook.printInfo();
        System.out.println();

        System.out.println("=== Печатная книга ===");
        pbook.printInfo();
        System.out.println();

        System.out.println("=== Аудиокнига ===");
        abook.printInfo();
        System.out.println();

        System.out.println("=== Научная книга ===");
        sbook.printInfo();
    }
}