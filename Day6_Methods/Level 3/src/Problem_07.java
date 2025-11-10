import java.util.Arrays;

class NumberChecker {

    public static int[] getFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) factors[index++] = i;
        }
        return factors;
    }

    public static int greatestFactor(int[] factors) {
        int max = factors[0];
        for (int f : factors) {
            if (f > max) max = f;
        }
        return max;
    }

    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) product *= f;
        return product;
    }

    public static double productOfCubes(int[] factors) {
        double product = 1;
        for (int f : factors) product *= Math.pow(f, 3);
        return product;
    }
}

public class Problem_07 {
    public static void main(String[] args) {
        int number = 12;
        int[] factors = NumberChecker.getFactors(number);

        System.out.println("Number: " + number);
        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Greatest Factor: " + NumberChecker.greatestFactor(factors));
        System.out.println("Sum of Factors: " + NumberChecker.sumOfFactors(factors));
        System.out.println("Product of Factors: " + NumberChecker.productOfFactors(factors));
        System.out.println("Product of Cubes of Factors: " + NumberChecker.productOfCubes(factors));
    }
}
