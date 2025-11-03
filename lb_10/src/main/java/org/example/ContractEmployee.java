package org.example;

public class ContractEmployee extends Employee {
    public ContractEmployee(String fullName, String position, double salary) throws OkladException {
        super(fullName, position, salary);
    }

    @Override
    public double calculateSalary() {
        try {
            return getSalary(); // Можно добавить логику контракта
        } catch (Exception e) {
            System.out.println("Ошибка при расчете зарплаты по контракту: " + e.getMessage());
            return 0;
        }
    }
}
