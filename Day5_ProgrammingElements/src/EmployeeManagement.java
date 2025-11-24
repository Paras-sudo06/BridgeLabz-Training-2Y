class Employee {
    protected String name;
    protected int id;
    protected double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: Rs" + salary);
    }
}

class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int id, double salary, String language) {
        super(name, id, salary);
        this.programmingLanguage = language;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    private int internshipDuration;

    public Intern(String name, int id, double salary, int duration) {
        super(name, id, salary);
        this.internshipDuration = duration;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + internshipDuration + " months");
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Manager m = new Manager("Alice", 101, 80000, 10);
        Developer d = new Developer("Bob", 102, 60000, "Java");
        Intern i = new Intern("Charlie", 103, 20000, 6);

        System.out.println("Employee Details");
        m.displayDetails();
        d.displayDetails();
        i.displayDetails();
    }
}