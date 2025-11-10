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

    public static boolean isDuckNumber(int number) {
        int[] digits = getDigitsArray(number);
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }

    public static boolean isArmstrong(int number) {
        int[] digits = getDigitsArray(number);
        int n = digits.length;
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, n);
        return sum == number;
    }

    public static void findLargestAndSecondLargest(int[] digits) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > first) {
                second = first;
                first = d;
            } else if (d > second && d != first) {
                second = d;
            }
        }
        System.out.println("Largest: " + first);
        System.out.println("Second Largest: " + second);
    }

    public static void findSmallestAndSecondSmallest(int[] digits) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < first) {
                second = first;
                first = d;
            } else if (d < second && d != first) {
                second = d;
            }
        }
        System.out.println("Smallest: " + first);
        System.out.println("Second Smallest: " + second);
    }
}

public class Problem_02 {
    public static void main(String[] args) {
        int number = 153;
        System.out.println("Number: " + number);
        System.out.println("Digit Count: " + NumberChecker.countDigits(number));

        int[] digits = NumberChecker.getDigitsArray(number);
        System.out.println("Digits Array: " + Arrays.toString(digits));

        System.out.println("Is Duck Number: " + NumberChecker.isDuckNumber(number));
        System.out.println("Is Armstrong Number: " + NumberChecker.isArmstrong(number));

        NumberChecker.findLargestAndSecondLargest(digits);
        NumberChecker.findSmallestAndSecondSmallest(digits);
    }
}
