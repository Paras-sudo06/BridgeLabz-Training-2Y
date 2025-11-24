import java.util.function.Function;

public class StrengthLengthChecker {
    public static void main(String[] args) {
        int limit = 50;

        Function<String, Integer> getLength = message -> message.length();

        String msg1 = "Hello! This is a short message.";
        String msg2 = "This message is quite long and may exceed the allowed character limit for display or storage.";

        checkMessageLength(msg1, getLength, limit);
        checkMessageLength(msg2, getLength, limit);
    }

    static void checkMessageLength(String message, Function<String, Integer> lengthFunction, int limit) {
        int length = lengthFunction.apply(message);

        if (length > limit) {
            System.out.println("Message exceeds limit (" + length + "/" + limit + " characters).");
        } else {
            System.out.println("Message within limit (" + length + "/" + limit + " characters).");
        }
    }
}
