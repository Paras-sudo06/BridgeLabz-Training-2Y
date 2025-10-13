import java.util.ArrayList;
import java.util.List;

class Employee {
    private String name;
    private String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public void showDetails() {
        System.out.println("Employee: " + name + ", Role: " + role);
    }
}

class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String name, String role) {
        employees.add(new Employee(name, role));
    }

    public void showDepartmentDetails() {
        System.out.println("\nDepartment: " + name);
        for (Employee e : employees) {
            e.showDetails();
        }
    }

    public void clearEmployees() {
        employees.clear();
    }
}

class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void showCompanyDetails() {
        System.out.println("Company: " + name);
        for (Department d : departments) {
            d.showDepartmentDetails();
        }
    }

    public void closeCompany() {
        for (Department d : departments) {
            d.clearEmployees();
        }
        departments.clear();
        System.out.println("\nCompany " + name + " and all its departments and employees are deleted.");
    }
}

public class CompositionExample {
    public static void main(String[] args) {
        Company company = new Company("TechNova Pvt Ltd");

        Department d1 = new Department("IT");
        Department d2 = new Department("HR");

        d1.addEmployee("Paras", "Software Engineer");
        d1.addEmployee("Riya", "Backend Developer");

        d2.addEmployee("Aman", "HR Manager");
        d2.addEmployee("Neha", "Recruiter");

        company.addDepartment(d1);
        company.addDepartment(d2);

        company.showCompanyDetails();

        company.closeCompany();
    }
}
