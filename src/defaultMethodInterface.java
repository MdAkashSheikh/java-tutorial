interface Demo {
    void abc();
    default void show() {
        System.out.println("In Show");
    }
}

class DemoImp implements Demo {
    public void abc() {
        System.out.println("In ABC");
    }
}
public class defaultMethodInterface {
    public static void main(String[] args) {
        Demo obj = new DemoImp();
        obj.abc();
        obj.show();
    }
}
