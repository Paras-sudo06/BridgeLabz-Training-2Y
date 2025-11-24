class Model implements Cloneable {
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloneTest {
    public static void main(String[] args) throws Exception {
        Model m1 = new Model();
        Model m2 = (Model) m1.clone();
        System.out.println("Cloned successfully!");
    }
}
