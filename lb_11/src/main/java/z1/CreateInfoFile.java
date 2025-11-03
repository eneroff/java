package z1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateInfoFile {
    public static void main(String[] args) {
        String filename = "about_me.txt";
        String content = "Имя: Данила\nГород: Минск\nИнтересы: программирование, дизайн, экономика";

        try {
            File file = new File(filename);
            FileWriter writer = new FileWriter(file);
            writer.write(content);
            writer.close();

            System.out.println("Файл успешно создан и заполнен.");
        } catch (IOException e) {
            System.err.println("Ошибка при создании файла: " + e.getMessage());
        }
    }
}