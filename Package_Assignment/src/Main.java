import college.student.Student;
import college.faculty.Faculty;

public class Main {
    public static void main(String[] args) {

        Student s = new Student("Riya", 101);
        Faculty f = new Faculty("Kashish", "Computer Science");

        s.showStudent();
        System.out.println("------------------");
        f.showFaculty();
    }
}
