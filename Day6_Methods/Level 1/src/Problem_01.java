import java.util.Scanner;

public class Problem_01{
    static double simpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        double SI = simpleInterest(principal, rate, time);
        System.out.println("The Simple Interest is " + SI +
                           " for Principal " + principal +
                           ", Rate of Interest " + rate +
                           " and Time " + time);

        sc.close();
    }
}
