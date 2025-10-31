public class UserAgeValidator {

    public static boolean isValidAge(String ageInput) {
        try {
            int age = Integer.parseInt(ageInput);
            return age >= 18;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        String[] inputs = {"20", "17", "abc", "18", "-5"};
        for (String input : inputs) {
            System.out.println("Input: " + input + " → Valid: " + isValidAge(input));
        }
    }
}
