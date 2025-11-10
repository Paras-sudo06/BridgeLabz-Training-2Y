import java.util.Arrays;

class Number_Checker {

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

    public static int[] reverseArray(int[] digits) {
        int[] rev = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            rev[i] = digits[digits.length - 1 - i];
        }
        return rev;
    }

    public static boolean arraysEqual(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static boolean isPalindrome(int number) {
        int[] digits = getDigitsArray(number);
        int[] reversed = reverseArray(digits);
        return arraysEqual(digits, reversed);
    }

    public static boolean isDuckNumber(int number) {
        int[] digits = getDigitsArray(number);
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }
}

public class Problem_04 {
    public static void main(String[] args) {
        int number = 12021;
        System.out.println("Number: " + number);
        System.out.println("Digit Count: " + NumberChecker.countDigits(number));

        int[] digits = Number_Checker.getDigitsArray(number);
        System.out.println("Digits Array: " + Arrays.toString(digits));

        int[] reversed = Number_Checker.reverseArray(digits);
        System.out.println("Reversed Array: " + Arrays.toString(reversed));

        System.out.println("Arrays Equal: " + Number_Checker.arraysEqual(digits, reversed));
        System.out.println("Is Palindrome: " + Number_Checker.isPalindrome(number));
        System.out.println("Is Duck Number: " + Number_Checker.isDuckNumber(number));
    }
}
