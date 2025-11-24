class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

class BoxTest {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.set(100);
        System.out.println(intBox.get());

        Box<String> strBox = new Box<>();
        strBox.set("Hello");
        System.out.println(strBox.get());

        Box<Double> doubleBox = new Box<>();
        doubleBox.set(99.9);
        System.out.println(doubleBox.get());
    }
}
