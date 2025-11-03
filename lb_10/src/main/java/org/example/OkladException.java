package org.example;

public class OkladException extends Exception {
    public OkladException(double salary) {
        super("Невозможно создать сотрудника – указан отрицательный оклад: " + salary);
    }
}
