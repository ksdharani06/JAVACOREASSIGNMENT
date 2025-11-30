public class Student {

    private int studentId;
    private String name;
    private char grade;
    private double marks;

    public Student(int studentId, String name, char grade, double marks) {
        this.studentId = studentId;
        this.name = name;
        this.grade = grade;
        this.marks = marks;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public char getGrade() {
        return grade;
    }

    public double getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return studentId + "  " + name + "  " + grade + "  " + marks;
    }
}
