class A {
    public void show() {
        System.out.println("In A SHOW");
    }
}
class B extends A {
    public void show() {
        System.out.println("In B Show");
    }
}

public class FinalDemo {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
