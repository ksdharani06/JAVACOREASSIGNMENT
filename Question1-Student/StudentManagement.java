import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class StudentManagement {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "dharani", 'A', 92.5));
        students.add(new Student(2, "shanthi", 'B', 78.0));
        students.add(new Student(3, "Chitra", 'A', 88.0));
        students.add(new Student(4, "Deepak", 'C', 55.5));
        students.add(new Student(5, "Esha", 'D', 42.0));
        students.add(new Student(6, "ram", 'F', 35.0));
        students.add(new Student(7, "Gita", 'B', 69.0));
        students.add(new Student(8, "dharu", 'A', 95.0));
        students.add(new Student(9, "Indira", 'C', 60.0));
        students.add(new Student(10, "guru", 'B', 81.0));

        System.out.println("Students with grade 'A':");
        for (Student s : students) {
            if (s.getGrade() == 'A') {
                System.out.println(s);
            }
        }
        System.out.println();

        students.removeIf(s -> s.getMarks() < 40);

        System.out.println("After removing students with marks < 40:");
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println();

    
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareToIgnoreCase(s2.getName());
            }
        });


        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println();


        Map<Character, Integer> gradeCount = new HashMap<>();
        gradeCount.put('A', 0);
        gradeCount.put('B', 0);
        gradeCount.put('C', 0);
        gradeCount.put('D', 0);
        gradeCount.put('F', 0);

        for (Student s : students) {
            char grade = s.getGrade();
            gradeCount.put(grade, gradeCount.getOrDefault(grade, 0) + 1);
        }

        System.out.println("grade frq   : ");
        for (Map.Entry<Character, Integer> entry : gradeCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
