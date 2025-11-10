import java.util.Arrays;

class NumberChecker {

    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    public static int[] getDigitsArray(int number) {
        String num = String.valueOf(Math.abs(number));
        int[] digits = new int[num.length()];
        for (int i = 0; i < num.length(); i++) {
            digits[i] = num.charAt(i) - '0';
        }
        return digits;
    }

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }

    public static boolean isHarshad(int number) {
        int[] digits = getDigitsArray(number);
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    public static int[][] digitFrequency(int number) {
        int[] digits = getDigitsArray(number);
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) freq[i][0] = i;
        for (int d : digits) freq[d][1]++;
        return freq;
    }
}

public class Problem_03 {
    public static void main(String[] args) {
        int number = 1729;
        System.out.println("Number: " + number);
        System.out.println("Digit Count: " + NumberChecker.countDigits(number));
        int[] digits = NumberChecker.getDigitsArray(number);
        System.out.println("Digits Array: " + Arrays.toString(digits));
        System.out.println("Sum of Digits: " + NumberChecker.sumOfDigits(digits));
        System.out.println("Sum of Squares: " + NumberChecker.sumOfSquares(digits));
        System.out.println("Is Harshad Number: " + NumberChecker.isHarshad(number));
        System.out.println("Digit Frequency (Digit | Count):");
        int[][] freq = NumberChecker.digitFrequency(number);
        for (int[] row : freq) {
            if (row[1] > 0)
                System.out.println(row[0] + " | " + row[1]);
        }
    }
}
