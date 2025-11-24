import java.util.*;

public class FrequencyCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        System.out.print("How many words? ");
        int n = input.nextInt();
        input.nextLine();

        System.out.println("Enter words:");
        for (int i = 0; i < n; i++) {
            list.add(input.nextLine());
        }

        HashMap<String, Integer> freq = new HashMap<>();

        for (String word : list) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        System.out.println("Frequency: " + freq);
        input.close();
    }
}