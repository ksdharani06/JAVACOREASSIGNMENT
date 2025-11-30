import java.util.ArrayList;

public class StudentManagement {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(1, "dharani", 'A', 92.5));
        students.add(new Student(2, "shanthi", 'B', 78));
        students.add(new Student(3, "Chitra", 'A', 88));
        students.add(new Student(4, "Deepak", 'C', 55.5));
        students.add(new Student(5, "Esha", 'D', 42));
        students.add(new Student(6, "ram", 'F', 35));
        students.add(new Student(7, "Gita", 'B', 69));
        students.add(new Student(8, "dharu", 'A', 95));
        students.add(new Student(9, "Indira", 'C', 60));
        students.add(new Student(10, "guru", 'B', 81));

        System.out.println("Students with grade A:");
        for (Student s : students) {
            if (s.getGrade() == 'A') {
                System.out.println(s);
            }
        }

       
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getMarks() < 40) {
                students.remove(i);
                i--; 
            }
        }

        System.out.println("After removing students with marks < 40:");
        for (Student s : students) {
            System.out.println(s);
        }

        for (int i = 0; i < students.size(); i++) {
            for (int j = i + 1; j < students.size(); j++) {
                if (students.get(i).getName()
                        .compareToIgnoreCase(students.get(j).getName()) > 0) {

                    Student temp = students.get(i);
                    students.set(i, students.get(j));
                    students.set(j, temp);
                }
            }
        }

        System.out.println("Students sorted by name:");
        for (Student s : students) {
            System.out.println(s);
        }

        int countA = 0, countB = 0, countC = 0, countD = 0, countF = 0;

        for (Student s : students) {
            switch (s.getGrade()) {
                case 'A':
                    countA++;
                    break;
                case 'B':
                    countB++;
                    break;
                case 'C':
                    countC++;
                    break;
                case 'D':
                    countD++;
                    break;
                case 'F':
                    countF++;
                    break;
            }
        }

        System.out.println("Grade Frequency:");
        System.out.println("A -> " + countA);
        System.out.println("B -> " + countB);
        System.out.println("C -> " + countC);
        System.out.println("D -> " + countD);
        System.out.println("F -> " + countF);
    }
}
