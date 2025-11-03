package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            Employee e1 = new Employee("Иванов И.И.", "Аналитик", -50000);
        } catch (OkladException e) {
            System.out.println(e.getMessage());
            try {
                Employee e1 = new Employee("Иванов И.И.", "Аналитик", 50000);
                System.out.println("Сотрудник создан: " + e1.getFullName());
            } catch (OkladException ex) {
                System.out.println("Повторная ошибка: " + ex.getMessage());
            }
        }

        try {
            StaffEmployee se = new StaffEmployee("Петров П.П.", "Разработчик", 60000, -5000);
            System.out.println("Зарплата штатного сотрудника: " + se.calculateSalary());
        } catch (OkladException e) {
            System.out.println("Ошибка оклада: " + e.getMessage());
        }

        try {
            ContractEmployee ce = new ContractEmployee("Сидоров С.С.", "Тестировщик", 45000);
            System.out.println("Зарплата контрактного сотрудника: " + ce.calculateSalary());
        } catch (OkladException e) {
            System.out.println("Ошибка оклада: " + e.getMessage());
        }
    }
}