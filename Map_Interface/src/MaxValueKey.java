import java.util.*;

public class MaxValueKey {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Map<String, Integer> map = new HashMap<>();

        System.out.print("How many entries? ");
        int n = input.nextInt();
        input.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter key: ");
            String key = input.nextLine();
            System.out.print("Enter value: ");
            int value = input.nextInt();
            input.nextLine();

            map.put(key, value);
        }

        String maxKey = map.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);

        System.out.println("Key with the highest value: " + maxKey);
        input.close();
    }
}