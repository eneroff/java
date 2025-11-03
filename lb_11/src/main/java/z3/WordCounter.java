package z3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCounter {
    public static void main(String[] args) {
        String filename = "text.txt";
        int wordCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Разделение строки по пробелам и знакам препинания
                String[] words = line.trim().split("[\\s\\p{Punct}]+");
                wordCount += words.length;
            }
            System.out.println("Количество слов в файле: " + wordCount);
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
