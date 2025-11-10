import java.util.Scanner;

public class Problem_02 {
    static int Handshake(int no){
        return (no * (no-1))/2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numofstu = sc.nextInt();
        int numofhand = Handshake(numofstu);
        System.out.println("The nunber of Possible Handshakes:"+numofhand);
    }
}
