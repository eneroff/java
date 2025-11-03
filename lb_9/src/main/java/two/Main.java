package two;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Анна", "A1", 1, List.of(4, 5, 3)));
        students.add(new Student("Иван", "B2", 2, List.of(2, 2, 3)));
        students.add(new Student("Мария", "C3", 3, List.of(3, 3, 4)));
        students.add(new Student("Олег", "D4", 1, List.of(5, 5, 5)));

        updateStudents(students);
        printStudents(students, 2);
    }

    public static void updateStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.getAverageGrade() < 3.0) {
                iterator.remove();
            } else {
                s.setCourse(s.getCourse() + 1);
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("Студенты на курсе " + course + ":");
        for (Student s : students) {
            if (s.getCourse() == course) {
                System.out.println(s.getName());
            }
        }
    }
}
