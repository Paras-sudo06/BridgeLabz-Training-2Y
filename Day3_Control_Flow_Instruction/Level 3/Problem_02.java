import java.util.Scanner;

public class Problem_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Physics marks: ");
        int physics = sc.nextInt();
        System.out.print("Enter Chemistry marks: ");
        int chemistry = sc.nextInt();
        System.out.print("Enter Maths marks: ");
        int maths = sc.nextInt();

        int total = physics + chemistry + maths;
        double average = total / 3.0;

        System.out.println("Average Marks = " + average);

        // Grade system
        if (average >= 90) {
            System.out.println("Grade = A | Excellent!");
        } else if (average >= 75) {
            System.out.println("Grade = B | Very Good");
        } else if (average >= 60) {
            System.out.println("Grade = C | Good");
        } else if (average >= 40) {
            System.out.println("Grade = D | Pass");
        } else {
            System.out.println("Grade = F | Fail");
        }
    }
}
