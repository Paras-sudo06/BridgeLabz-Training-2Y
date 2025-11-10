import java.util.Scanner;

public class Problem_09 {
      public static int[] findRemainderAndQuotient(int number, int divisor) {
        int eachChildGets = number / divisor;
        int remaining = number % divisor;
        return new int[]{eachChildGets, remaining};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int chocolates = sc.nextInt();
        System.out.print("Enter number of children: ");
        int children = sc.nextInt();

        int[] result = findRemainderAndQuotient(chocolates, children);
        System.out.println("Each child gets: " + result[0] + " chocolates, Remaining: " + result[1]);
    }
}
