class Printer {
    public void show(Integer i) {
        System.out.println("INTEGER");
        System.out.println(i);
    }
    public void show(Double d) {
        System.out.println("DOUBLE");
        System.out.println(d);
    }
}

public class AbastractClass {
    public static void main(String[] args) {
        Printer obj = new Printer();

        obj.show(76);
        obj.show(8.90);
    }
}
