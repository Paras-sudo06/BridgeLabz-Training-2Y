import java.util.Random;

class NegativeAmountException extends Exception {
    public NegativeAmountException(String message) {
        super(message);
    }
}
//
//class InsufficientFundsException extends Exception {
//    public InsufficientFundsException(String message) {
//        super(message);
//    }
//}

class NetworkFailureException extends Exception {
    public NetworkFailureException(String message) {
        super(message);
    }
}

class Transaction {
    private double balance = 10000;

    public void processTransaction(double amount)
            throws NegativeAmountException, InsufficientFundsException, NetworkFailureException {

        Random random = new Random();
        int scenario = random.nextInt(3);

        if (amount < 0)
            throw new NegativeAmountException("Transaction failed: Amount cannot be negative!");

        if (scenario == 0)
            throw new InsufficientFundsException("Transaction failed: Insufficient balance!");
        else if (scenario == 1)
            throw new NetworkFailureException("Transaction failed: Network connection lost!");
        else {
            if (amount > balance)
                throw new InsufficientFundsException("Transaction failed: Insufficient balance!");
            else {
                balance -= amount;
                System.out.println("Transaction successful! Remaining Balance: ₹" + balance);
            }
        }
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Transaction transaction = new Transaction();

        try {
            transaction.processTransaction(5000);
        }
        catch (NegativeAmountException e) {
            System.out.println(e.getMessage());
        }
        catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        catch (NetworkFailureException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Thank you for banking with us!");
        }
    }
}
