import java.util.Scanner;

public class Problem_06 {
    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false; // invalid age
        } else if (age >= 18) {
            return true;  // eligible
        } else {
            return false; // not eligible
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Problem_06 checker = new Problem_06(); // ✅ Fixed

        int[] ages = new int[10];

        System.out.println("Enter ages of 10 students:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();

            boolean canVote = checker.canStudentVote(ages[i]);

            if (ages[i] < 0) {
                System.out.println("Invalid age entered! Cannot vote.");
            } else if (canVote) {
                System.out.println("Student " + (i + 1) + " (age " + ages[i] + ") can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " (age " + ages[i] + ") cannot vote.");
            }
        }

        sc.close();
    }
}
