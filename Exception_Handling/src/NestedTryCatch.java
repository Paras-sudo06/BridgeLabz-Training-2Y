class NestedTryCatch {

    static void methodB() {
        try {
            String str = "abc";
            int num = Integer.parseInt(str);  // Causes NumberFormatException
            String text = null;
            System.out.println(text.length()); // Causes NullPointerException
        }
        catch (NumberFormatException e) {
            System.out.println("Caught in methodB: Number format issue -> " + e.getMessage());
        }
    }

    static void methodA() {
        try {
            methodB();  // Calling methodB
        }
        catch (NullPointerException e) {
            System.out.println("Caught in methodA: Null pointer issue -> " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        methodA();
        System.out.println("Program executed successfully!");
    }
}
