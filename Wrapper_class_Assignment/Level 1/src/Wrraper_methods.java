public class Wrraper_methods {
    public static void main(String[] args) {

        int num = Integer.parseInt("123");
        double d = Double.parseDouble("3.14");
        boolean bool = Boolean.parseBoolean("true");
        String binary = Integer.toBinaryString(10);
        boolean isDigit = Character.isDigit('5');
        char upper = Character.toUpperCase('a');

        // Printing all results
        System.out.println("Integer.parseInt(\"123\") = " + num);
        System.out.println("Double.parseDouble(\"3.14\") = " + d);
        System.out.println("Boolean.parseBoolean(\"true\") = " + bool);
        System.out.println("Integer.toBinaryString(10) = " + binary);
        System.out.println("Character.isDigit('5') = " + isDigit);
        System.out.println("Character.toUpperCase('a') = " + upper);
    }
}
