interface Writer1 {
    public abstract void write();
}
class Pen1 extends A implements Writer1{
    public void write() {
        System.out.println("I am PEN");
    }
}
class Pencil1 implements Writer1 {
    public void write() {
        System.out.println("I am PENCIL");
    }
}

class Kit {
    public void doSomething(Writer1 p) {
        p.write();
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Writer1 p =  new Pen1();
        Writer1 pc =  new Pencil1();
        pc.write();
        p.write();
    }
}
