import java.util.ArrayList;
import java.util.Scanner;

public class Problem_01 {
    static ArrayList<Integer> findfactors(int num) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                numbers.add(i);
            }
        }
        return numbers;
    }

    static int findSum(ArrayList<Integer> factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }

    static long findproducts(ArrayList<Integer> factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }

    static int findSumOfSquares(ArrayList<Integer> result) {
        int sumSq = 0;
        for (int f : result) {
            sumSq += (int)Math.pow(f, 2);
        }
        return sumSq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        ArrayList<Integer> result = findfactors(num1);

        System.out.println("Factors of " + num1 + " are: " + result);
        System.out.println("Sum of factors = " + findSum(result));
        System.out.println("Product of factors = " + findproducts(result));
        System.out.println("Sum of squares of factors = " + findSumOfSquares(result));
    }
}
