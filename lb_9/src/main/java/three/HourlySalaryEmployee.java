package three;

public class HourlySalaryEmployee extends Employee {
    private double hourlyRate;

    public HourlySalaryEmployee(int id, String name, double hourlyRate) {
        super(id, name);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getAverageSalary() {
        return 20.8 * 8 * hourlyRate;
    }
}