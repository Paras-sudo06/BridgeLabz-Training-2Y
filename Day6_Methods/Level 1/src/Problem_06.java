import java.util.Scanner;

public class Problem_06 {
    static int Sum(int num){
        int sum = 0;
        for(int i = 1;i<=num;i++){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Number");
        int num = sc.nextInt();

        int sum = Sum(num);
        System.out.println("the Sum of Natural number is:"+sum);
    }
}
