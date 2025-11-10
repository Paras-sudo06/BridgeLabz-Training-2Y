import java.util.Scanner;

public class Problem_05 {
    static boolean Springseason(int month,int day){
        if (month == 3 && day >= 20 && day <= 31) {
            return true;
        }
        
        else if (month == 4 || month == 5) {
            return true;
        }
        
        else if (month == 6 && day <= 20) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month 1 to 12");
        int month = sc.nextInt();
        System.out.println("Enter the day between 1 to 31:");
        int day = sc.nextInt();

        if(Springseason(month, day)){
            System.out.println("It's a Spring Season");
        }else{
            System.out.println("It's not a Spring Season");
        }
    }
}
