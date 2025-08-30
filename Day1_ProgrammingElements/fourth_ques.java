import java.util.Scanner;

public class fourth_ques {
	public static void main(String[] args) {
	final double pi = 3.14;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter radius");
	int radius = sc.nextInt();
	System.out.println("Enter height");
	int height = sc.nextInt();
	double Volume = pi * radius *radius *height;
	System.out.println("The volume of cylinder is:"+Volume);
	}
}
