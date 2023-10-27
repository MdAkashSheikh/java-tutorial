class Abc1{
    public void show() {
        System.out.println("In Abc1 Show");
    }
}
public class AnonymousDemo {
    public static void main(String[] args) {
        Abc1 obj = new Abc1() {
            public void show() {
                System.out.println("In Anonymous Class");
            }
        };

        obj.show();
    }
}
