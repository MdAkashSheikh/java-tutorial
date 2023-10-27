class A {
    public final void show() {
        System.out.println("In A SHOW");
    }
}
class B extends A {

}

public class FinalDemo {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
