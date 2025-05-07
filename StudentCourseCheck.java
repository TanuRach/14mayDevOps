// File: StudentCourseCheck.java
public class StudentCourseCheck {
    String name, program, course;
    int semester, marks;

    public StudentCourseCheck(String name, String program, int semester, String course, int marks) {
        this.name = name;
        this.program = program;
        this.semester = semester;
        this.course = course;
        this.marks = marks;
    }

    void display() {
        System.out.println("Student: " + name + ", Program: " + program + ", Semester: " + semester + ", Course: " + course + ", Marks: " + marks);
        if (marks < 40) {
            System.out.println("Alert: Marks below 40 in " + course);
        }
    }

    public static void main(String[] args) {
        StudentCourseCheck s1 = new StudentCourseCheck("Alice", "BCA", 2, "Math", 35);
        StudentCourseCheck s2 = new StudentCourseCheck("Bob", "BCA", 2, "English", 45);
        s1.display();
        s2.display();
    }
}
