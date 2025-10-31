public class Wrappper_Comparison {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;

        boolean result1 = a == b;
        boolean result2 = c == d;

        boolean result3 = a.equals(b);
        boolean result4 = c.equals(d);

        System.out.println("The Output of a == b is:"+ result1);
        System.out.println("The Output of c == d is:"+ result2);
        System.out.println("The Output of a.equals(b) is:"+ result3);
        System.out.println("The Output of c.equals(d) is:"+ result4);
    }
}
