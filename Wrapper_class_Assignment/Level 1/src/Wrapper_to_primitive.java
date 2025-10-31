public class Wrapper_to_primitive {
    public static void main(String[] args) {
        Double object = 45.67;

        double d = object.floatValue();

        int i = (int) d;

        System.out.println("The value of object in primitive: "+d);
        System.out.println("The value in integer is:"+i);
    }
}
