import java.util.ArrayList;
import java.util.List;

class Subject {
    private String name;
    private int marks;

    public Subject(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}

class Student {
    private String name;
    private List<Subject> subjects;

    public Student(String name) {
        this.name = name;
        this.subjects = new ArrayList<>();
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public String getName() {
        return name;
    }
}

class GradeCalculator {
    public char calculateGrade(Student student) {
        int totalMarks = 0;
        int subjectCount = student.getSubjects().size();

        for (Subject s : student.getSubjects()) {
            totalMarks += s.getMarks();
        }

        double average = (double) totalMarks / subjectCount;

        if (average >= 90) return 'A';
        else if (average >= 80) return 'B';
        else if (average >= 70) return 'C';
        else if (average >= 60) return 'D';
        else return 'F';
    }
}

public class SchoolResultsApp {
    public static void main(String[] args) {
        Student john = new Student("John");

        john.addSubject(new Subject("Maths", 90));
        john.addSubject(new Subject("Science", 85));
        john.addSubject(new Subject("English", 78));

        GradeCalculator calculator = new GradeCalculator();
        char grade = calculator.calculateGrade(john);

        System.out.println("Student: " + john.getName());
        System.out.println("Subjects and Marks:");
        for (Subject s : john.getSubjects()) {
            System.out.println(s.getName() + ": " + s.getMarks());
        }
        System.out.println("Final Grade: " + grade);
    }
}
