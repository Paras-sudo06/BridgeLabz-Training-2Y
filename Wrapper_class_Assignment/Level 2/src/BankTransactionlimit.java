public class BankTransactionlimit {
    public static void main(String[] args) {
        Double newAccountLimit = 10000.0;
        Double oldAccountLimit = null;
        double withdrawn = 2500.0;

        System.out.println("Remaining (new Account): " + getRemainingLimit(newAccountLimit, withdrawn));
        System.out.println("Remaining (old Account): " + getRemainingLimit(oldAccountLimit, withdrawn));
    }

    public static double getRemainingLimit(Double limit, double amountWithdrawn) {
        if (limit == null) {
            return 0.0;
        }

        double remaining = limit - amountWithdrawn;
        return remaining >= 0 ? remaining : 0.0;
    }
}
