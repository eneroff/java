package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Course> courses = new HashMap<>();

        courses.put("Алгебра", new Math("Алгебра1"));
        courses.put("Геометрия", new Math("Геометрия1"));
        courses.put("Мировая история", new History("Мировая история1"));
        courses.put("Древняя история", new History("Древняя история1"));

        System.out.println("Список названий курсов:");
        for (String key : courses.keySet()) {
            System.out.println(key);
        }

        System.out.println("Список самих курсов:");
        for (Course name : courses.values()) {
            System.out.println(name);

        }

    }
}
