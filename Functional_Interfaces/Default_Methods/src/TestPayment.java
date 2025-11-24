interface PaymentProcessor {
    void pay(double amount);

    default void refund(double amount) {
        System.out.println("Refund processed: " + amount);
    }
}

class Paytm implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("Paid via Paytm: " + amount);
    }
}

public class TestPayment {
    public static void main(String[] args) {
        PaymentProcessor p = new Paytm();
        p.pay(500);
        p.refund(200);
    }
}
