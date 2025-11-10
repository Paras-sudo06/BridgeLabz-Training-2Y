import java.util.Scanner;

public class Problem_04 {
    static int Check(int number){
        return (number == 0) ? 0 : (number % 2 == 0 ? 1 : -1);
 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int valuehold = Check(num);
        System.out.println("Output is:"+valuehold);
    }
}
