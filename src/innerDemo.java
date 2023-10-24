class Outer {
    int a;
    public static void show() {
        System.out.println("Show Methos...");
    }
    static class Inner {
        public void display() {
            System.out.println("In Display....");
        }
    }
}
public class innerDemo {
    public static void main(String[] args) {
        Outer obj1 = new Outer();
        obj1.show();

        /* Outer.Inner obj12 = Outer.new Inner();   // Not Use Static
        * */
        Outer.Inner obj2 = new Outer.Inner();

        obj2.display();
    }
}
