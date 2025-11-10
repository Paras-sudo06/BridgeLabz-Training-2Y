class NumberChecker {

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }

    public static boolean isSpy(int number) {
        int sum = 0, product = 1;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product;
    }

    public static boolean isAutomorphic(int number) {
        int square = number * number;
        String numStr = String.valueOf(number);
        String sqStr = String.valueOf(square);
        return sqStr.endsWith(numStr);
    }

    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }
}

public class Problem_05 {
    public static void main(String[] args) {
        int number = 7;
        System.out.println("Number: " + number);
        System.out.println("Is Prime: " + NumberChecker.isPrime(number));
        System.out.println("Is Neon: " + NumberChecker.isNeon(number));
        System.out.println("Is Spy: " + NumberChecker.isSpy(number));
        System.out.println("Is Automorphic: " + NumberChecker.isAutomorphic(number));
        System.out.println("Is Buzz: " + NumberChecker.isBuzz(number));
    }
}
