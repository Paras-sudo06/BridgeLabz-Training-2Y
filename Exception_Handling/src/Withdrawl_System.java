// Custom exception class
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class ATM {
    private int balance = 10000;  // ₹10,000 initial balance

    public void withdraw(int amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(
                    "Insufficient Balance! You tried to withdraw ₹" + amount +
                            " but only ₹" + balance + " is available."
            );
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful! Remaining Balance: ₹" + balance);
        }
    }
}

// Main class
public class Withdrawl_System {
    public static void main(String[] args) {
        ATM atm = new ATM();

        try {
            System.out.println("Attempting to withdraw ₹12000...");
            atm.withdraw(12000); // try withdrawing more than balance
        }
        catch (InsufficientFundsException e) {
            System.out.println("Transaction Failed: " + e.getMessage());
        }

        System.out.println("Thank you for using the ATM!");
    }
}
