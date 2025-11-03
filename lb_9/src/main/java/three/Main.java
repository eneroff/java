package three;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Средние символы строки 'string': " + StringUtils.getMiddleTwo("string"));
        System.out.println("Средние символы строки 'code': " + StringUtils.getMiddleTwo("code"));
        System.out.println("Средние символы строки 'Practice': " + StringUtils.getMiddleTwo("Practice"));

        List<Employee> employees = new ArrayList<>();
        employees.add(new FixedSalaryEmployee(101, "Алиса", 3000));
        employees.add(new HourlySalaryEmployee(102, "Ярик", 15));
        employees.add(new FixedSalaryEmployee(103, "Катя", 2800));
        employees.add(new HourlySalaryEmployee(104, "Настя", 20));
        employees.add(new FixedSalaryEmployee(105, "Женя", 3000));
        employees.add(new HourlySalaryEmployee(106, "Матвей", 18));
        employees.add(new FixedSalaryEmployee(107, "Ваня", 2500));
        employees.add(new HourlySalaryEmployee(108, "Витя", 22));

        employees.sort(Comparator
                .comparingDouble(Employee::getAverageSalary)
                .thenComparing(Comparator.comparing(Employee::getName).reversed()));

        System.out.println("\nВсе сотрудники:");
        for (Employee e : employees) {
            System.out.printf("Идентификатор: %d, Имя: %s, Среднемесячная зарплата: %.2f%n",
                    e.getId(), e.getName(), e.getAverageSalary());
        }

        System.out.println("\nПервые 5 имён сотрудников:");
        employees.stream()
                .limit(5)
                .map(Employee::getName)
                .forEach(name -> System.out.println("Имя: " + name));

        System.out.println("\nПоследние 3 идентификатора сотрудников:");
        employees.stream()
                .skip(Math.max(0, employees.size() - 3))
                .map(Employee::getId)
                .forEach(id -> System.out.println("ID: " + id));
    }
}
