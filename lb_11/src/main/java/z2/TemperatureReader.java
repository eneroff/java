package z2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TemperatureReader {
    public static void main(String[] args) {
        String filename = "temperature.txt";
        double sum = 0;
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                double temp = Double.parseDouble(line);
                sum += temp;
                count++;
            }

            if (count > 0) {
                double average = sum / count;
                System.out.printf("Средняя температура: %.2f°C%n", average);
            } else {
                System.out.println("Файл пуст.");
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
        }
    }
}