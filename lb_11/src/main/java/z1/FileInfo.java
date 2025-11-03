package z1;

import java.io.File;

public class FileInfo {
    public static void main(String[] args) {
        File file = new File("about_me.txt");

        if (file.exists()) {
            System.out.println("Имя файла: " + file.getName());
            System.out.println("Путь: " + file.getPath());
            System.out.println("Абсолютный путь: " + file.getAbsolutePath());
            System.out.println("Размер: " + file.length() + " байт");
            System.out.println("Можно читать: " + file.canRead());
            System.out.println("Можно записывать: " + file.canWrite());
            System.out.println("Это файл: " + file.isFile());
        } else {
            System.out.println("Файл не найден.");
        }
    }
}