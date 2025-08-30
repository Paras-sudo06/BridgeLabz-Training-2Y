import java.util.Scanner;

public class Problem_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
    
        if(num < 0){
            System.out.println("Please enter a natural number which is greater than 0");
        }
        else{
            for(int i = 1;i<=num;i++){
                if(i % 2 == 0){
                    System.out.println(i + " is an even number");
                }else{
                    System.out.println(i + " is an odd number");
                }
            }
        }
    }
}