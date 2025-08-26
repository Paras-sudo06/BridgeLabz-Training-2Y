import java.util.Scanner;

public class Problem_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number % 5 == 0) {
            System.out.println("The given number "+ number + "is divisible by " + 5 );
        } else {
            System.out.println("The given number "+ number + " is not divisible by" + 5);
        }
    }
}
