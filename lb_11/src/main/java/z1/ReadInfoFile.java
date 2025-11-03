package z1;

import java.io.FileReader;
import java.io.IOException;

public class ReadInfoFile {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("about_me.txt")) {
            int ch;
            System.out.println("Содержимое файла:");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}