interface Demo1 {
    void abc();
    default void show() {
        System.out.println("In Demo1 Show");
    }
}

interface MyDemo1 {
    default void show() {
        System.out.println("In MyDemo1 Show");
    }
}

class DemoImp1 implements Demo1, MyDemo1 {
    public void abc() {
        System.out.println("In ABC");
    }

    @Override
    public void show() {
        MyDemo1.super.show();
    }

}
public class MulInheritInterface {
    public static void main(String[] args) {
        Demo1 obj = new DemoImp1();

        obj.abc();
        obj.show();
    }
}
