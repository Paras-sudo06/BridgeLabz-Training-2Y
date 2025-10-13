import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double quantity;
    private double pricePerUnit;

    public Product(String name, double quantity, double pricePerUnit) {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public double getTotalPrice() {
        return quantity * pricePerUnit;
    }

    public void displayProduct() {
        System.out.println(name + " (" + quantity + " units at $" + pricePerUnit + " per unit) = $" + getTotalPrice());
    }
}

class GroceryCustomer {
    private String name;
    private List<Product> products;

    public GroceryCustomer(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public String getName() {
        return name;
    }
}

class BillGenerator {
    public double generateBill(GroceryCustomer customer) {
        double total = 0;
        for (Product p : customer.getProducts()) {
            total += p.getTotalPrice();
        }
        return total;
    }

    public void printBill(GroceryCustomer customer) {
        System.out.println("Bill for Customer: " + customer.getName());
        for (Product p : customer.getProducts()) {
            p.displayProduct();
        }
        System.out.println("Total Amount: $" + generateBill(customer));
    }
}

public class GroceryStoreApp {
    public static void main(String[] args) {
        GroceryCustomer alice = new GroceryCustomer("Alice");

        alice.addProduct(new Product("Apples", 2, 3));
        alice.addProduct(new Product("Milk", 1, 2));

        BillGenerator billGenerator = new BillGenerator();
        billGenerator.printBill(alice);
    }
}
