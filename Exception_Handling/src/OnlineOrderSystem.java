import java.util.Random;

class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}


class PaymentFailedException extends Exception {
    public PaymentFailedException(String message) {
        super(message);
    }
}


class OrderProcessing {
    public void placeOrder() throws OutOfStockException, PaymentFailedException {
        Random random = new Random();
        int scenario = random.nextInt(3); // 0, 1, or 2

        if (scenario == 0) {
            throw new OutOfStockException("Sorry! The product is out of stock.");
        }
        else if (scenario == 1) {
            throw new PaymentFailedException("Payment failed! Please check your payment method.");
        }
        else {
            System.out.println("Order placed successfully! 🎉");
        }
    }
}


public class OnlineOrderSystem {
    public static void main(String[] args) {
        OrderProcessing order = new OrderProcessing();

        try {
            order.placeOrder();
        }
        catch (OutOfStockException e) {
            System.out.println("Order Error: " + e.getMessage());
        }
        catch (PaymentFailedException e) {
            System.out.println("Order Error: " + e.getMessage());
        }
        finally {
            System.out.println("Thank you for shopping with us!");
        }
    }
}
