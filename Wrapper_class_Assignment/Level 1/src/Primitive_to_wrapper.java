import java.util.Scanner;

public class Primitive_to_wrapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check");
        int num = sc.nextInt();

        Integer objnum = num;

        System.out.println("The value of integer using Primitive is:"+num);
        System.out.println("The Value of integer using Object form is:"+objnum);
    }
}
