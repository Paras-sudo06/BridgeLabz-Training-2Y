import java.util.Scanner;

public class Problem_02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n1 = sc.nextInt(),n2 = sc.nextInt(),n3 = sc.nextInt();

        boolean result = (n1<= n2 && n1 <=n3);
        

        System.out.println("Result of first number is it smallest True or False ?" + result);

    }
}
