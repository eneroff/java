package three;

public class FixedSalaryEmployee extends Employee {
    private double monthlySalary;

    public FixedSalaryEmployee(int id, String name, double monthlySalary) {
        super(id, name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double getAverageSalary() {
        return monthlySalary;
    }
}