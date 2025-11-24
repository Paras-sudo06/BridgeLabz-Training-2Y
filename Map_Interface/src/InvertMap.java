import java.util.*;

public class InvertMap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Map<String, Integer> map = new HashMap<>();

        System.out.print("How many entries? ");
        int n = input.nextInt();
        input.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter key: ");
            String key = input.nextLine();
            System.out.print("Enter value (integer): ");
            int value = input.nextInt();
            input.nextLine();

            map.put(key, value);
        }

        Map<Integer, List<String>> inverted = new HashMap<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            inverted.computeIfAbsent(entry.getValue(), k -> new ArrayList<>())
                    .add(entry.getKey());
        }

        System.out.println(inverted);
        input.close();
    }
}