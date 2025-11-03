package org.example;

public class StaffEmployee extends Employee {
    private double bonus;

    public StaffEmployee(String fullName, String position, double salary, double bonus) throws OkladException {
        super(fullName, position, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        try {
            if (bonus < 0) {
                throw new PremiyaException(bonus);
            }
            return getSalary() + bonus;
        } catch (PremiyaException e) {
            System.out.println("Ошибка премии: " + e.getMessage());
            return getSalary();
        } catch (Exception e) {
            System.out.println("Общая ошибка при расчете зарплаты: " + e.getMessage());
            return 0;
        }
    }
}
