interface Abc {
    void show();
}

class Implimentor implements Abc {
    public void show() {
        System.out.println("Anything");
    }
}
public class InterfaceDemo1 {
    public static void main(String[] args) {
        Abc obj = new Implimentor();
        obj.show();
    }
}
