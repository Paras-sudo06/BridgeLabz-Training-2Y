import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = input.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.add(input.nextInt());
        }

        ArrayList<Integer> reversed = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));
        }

        System.out.println("Reversed List: " + reversed);
        input.close();
    }
}