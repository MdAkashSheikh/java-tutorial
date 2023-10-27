class A1{
    public void show1() {
        System.out.println("In Show1 in A");
    }
}

class B1 extends A1 {

}

public class finalDemo {
    public static void main(String[] args) {
        B1 obj = new B1();
        obj.show1();

    }
}
