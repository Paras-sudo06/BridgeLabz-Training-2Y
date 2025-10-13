import java.util.ArrayList;
import java.util.List;

class Bank {
    private String name;
    private List<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public void openAccount(Customer customer) {
        customers.add(customer);
        System.out.println(customer.getName() + " opened an account in " + name);
    }

    public String getName() {
        return name;
    }
}

class Customer {
    private String name;
    private double balance;
    private Bank bank;

    public Customer(String name, double balance, Bank bank) {
        this.name = name;
        this.balance = balance;
        this.bank = bank;
    }

    public String getName() {
        return name;
    }

    public void viewBalance() {
        System.out.println(name + " has ₹" + balance + " in " + bank.getName());
    }
}

public class AssociationExample {
    public static void main(String[] args) {
        Bank bank1 = new Bank("State Bank of India");
        Bank bank2 = new Bank("HDFC Bank");

        Customer c1 = new Customer("Paras", 25000, bank1);
        Customer c2 = new Customer("Aman", 40000, bank1);
        Customer c3 = new Customer("Riya", 55000, bank2);

        bank1.openAccount(c1);
        bank1.openAccount(c2);
        bank2.openAccount(c3);

        c1.viewBalance();
        c2.viewBalance();
        c3.viewBalance();
    }
}
