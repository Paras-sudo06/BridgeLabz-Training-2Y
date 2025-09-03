import java.util.*;

public class ShortestLongestWord {

    // Find string length without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) { }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String text = sc.nextLine();

        ArrayList<String> words = new ArrayList<>();
        String word = "";

        // Split text into words
        for (int i = 0; i < findLength(text); i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                if (!word.equals("")) words.add(word);
                word = "";
            } else {
                word += ch;
            }
        }
        if (!word.equals("")) words.add(word);

        // Assume first word is shortest & longest
        String shortest = words.get(0), longest = words.get(0);

        // Find shortest & longest
        for (String w : words) {
            if (findLength(w) < findLength(shortest)) shortest = w;
            if (findLength(w) > findLength(longest)) longest = w;
        }

        // Output
        System.out.println("Words: " + words);
        System.out.println("Shortest Word: " + shortest + " (" + findLength(shortest) + ")");
        System.out.println("Longest Word: " + longest + " (" + findLength(longest) + ")");
    }
}
