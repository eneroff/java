package z2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TemperatureWriter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filename = "temperature.txt";

        try (FileWriter writer = new FileWriter(filename)) {
            System.out.println("Введите 15 значений температуры:");
            for (int i = 0; i < 15; i++) {
                double temp = scanner.nextDouble();
                writer.write(temp + "\n");
            }
            System.out.println("Температуры записаны в файл.");
        } catch (IOException e) {
            System.err.println("Ошибка записи в файл: " + e.getMessage());
        }
    }
}
