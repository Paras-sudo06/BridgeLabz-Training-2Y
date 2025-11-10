class NumberChecker {

    public static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) sum += i;
        }
        return sum == number;
    }

    public static boolean isAbundant(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) sum += i;
        }
        return sum > number;
    }

    public static boolean isDeficient(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) sum += i;
        }
        return sum < number;
    }

    public static boolean isStrong(int number) {
        int temp = number;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

public class Problem_06 {
    public static void main(String[] args) {
        int number = 145;
        System.out.println("Number: " + number);
        System.out.println("Is Perfect Number: " + NumberChecker.isPerfect(number));
        System.out.println("Is Abundant Number: " + NumberChecker.isAbundant(number));
        System.out.println("Is Deficient Number: " + NumberChecker.isDeficient(number));
        System.out.println("Is Strong Number: " + NumberChecker.isStrong(number));
    }
}
