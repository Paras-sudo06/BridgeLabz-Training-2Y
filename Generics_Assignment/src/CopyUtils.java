import java.util.*;

class CopyUtil {

    public static void copyList(List<? super Number> dest, List<? extends Number> src) {
        for (Number n : src) {
            dest.add(n);
        }
    }

    public static void main(String[] args) {
        List<Number> dest = new ArrayList<>();
        List<Integer> src = Arrays.asList(5, 10, 15);

        copyList(dest, src);

        System.out.println(dest);   // [5, 10, 15]
    }
}
