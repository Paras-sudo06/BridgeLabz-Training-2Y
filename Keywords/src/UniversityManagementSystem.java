class Student {
    private static String universityName = "Bundelkhand University";
    private static int totalStudents = 0;

    private final int rollNumber;
    private String name;
    private String grade;

    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University Name: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
            System.out.println("---------------------------");
        } else {
            System.out.println("Not a valid Student object.");
        }
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Student student1 = new Student(101, "Paras Shukla", "A");
        Student student2 = new Student(102, "Amit Kumar", "B");

        student1.displayStudentDetails();
        student2.displayStudentDetails();

        Student.displayTotalStudents();

        student2.setGrade("A+");
        System.out.println("After updating grade:");
        student2.displayStudentDetails();
    }
}
