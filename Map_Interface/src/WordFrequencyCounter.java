import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String text = input.nextLine();

        Map<String, Integer> map = new HashMap<>();

        String cleaned = text.replaceAll("[^a-zA-Z0-9 ]", " ").toLowerCase();

        for (String word : cleaned.split("\\s+")) {
            if (word.isEmpty()) continue;
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println(map);
        input.close();
    }
}