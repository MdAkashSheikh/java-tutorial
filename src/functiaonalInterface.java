interface Abc2 {
    void show();
}
public class functiaonalInterface {
    public static void main(String[] args) {
        Abc2 obj = () -> System.out.println("I am the Best");

        obj.show();
    }
}
