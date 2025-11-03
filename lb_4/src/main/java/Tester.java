public class Tester {
    private String name;
    static String surname;
    private int experienceInYears;
    private String englishLevel;
    static double salary;
    static String family;

    public Tester() {
        this("Default", "User");
    }

    public Tester(String name, String surname) {
        this(name, surname, 0);
    }

    public Tester(String name, String surname, int experienceInYears) {
        this.name = name;
        this.surname = surname;

        this.experienceInYears = experienceInYears;
        this.englishLevel = "Intermediate";
        this.salary = 1000.0;
    }

    public void showInfo() {
        System.out.println(name + " " + surname);
        System.out.println(name + " = " + family);
    }

    public void showInfo(boolean detailed) {
        if (detailed) {
            System.out.println(name + " " + surname + ", " + experienceInYears + " years, " + englishLevel + ", $" + salary);
        } else {
            showInfo();
        }
    }

    public void showInfo(String prefix) {
        System.out.println(prefix + ": " + name + " " + surname);
    }

    public static void printTesterCount() {
        System.out.println("Total testers: 5");
    }
}