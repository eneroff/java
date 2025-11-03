public class Main {
    public static void main(String[] args) {
        Tester.printTesterCount();

        Tester t1 = new Tester("Данила", "Иванов", 2);
        t1.showInfo();
        t1.showInfo(true);
        t1.showInfo("Инженер-тестировщик");
    }
}