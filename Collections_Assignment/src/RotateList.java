import java.util.*;

public class RotateList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = input.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.add(input.nextInt());
        }

        System.out.print("Enter rotation number: ");
        int k = input.nextInt();

        k = k % n;

        ArrayList<Integer> rotated = new ArrayList<>();

        for (int i = k; i < n; i++) {
            rotated.add(list.get(i));
        }

        for (int i = 0; i < k; i++) {
            rotated.add(list.get(i));
        }

        System.out.println("Rotated List: " + rotated);
        input.close();
    }
}