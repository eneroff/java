package z3;

import java.io.FileWriter;
import java.io.IOException;

public class TextFileCreator {
    public static void main(String[] args) {
        String filename = "text.txt";
        String content = "Java — это мощный язык программирования. Он используется для создания приложений, сайтов и систем.";

        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(content);
            System.out.println("Файл успешно создан.");
        } catch (IOException e) {
            System.err.println("Ошибка при создании файла: " + e.getMessage());
        }
    }
}
