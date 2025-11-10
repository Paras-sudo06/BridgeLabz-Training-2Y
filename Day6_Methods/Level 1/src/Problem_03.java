import java.util.Scanner;

public class Problem_03 {
    static float Howmanyrounds(int a,int b,int c,int Total){
        return Total / (a + b + c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three Sides in meter:");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();
        int Total = 5000;

        float Rounds = Howmanyrounds(side1,side2,side3,Total);

        System.out.println("Number of rounds to complete 5km are:"+Rounds);

    }
}
