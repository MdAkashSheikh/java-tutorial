class Con1{
    int num1;
    int num2;

    public Con1() {
        num1 = 4;
        num2 = 5;

        System.out.println("In Con1");
    }
    public Con1(int m, int n) {
        num1 = m;
        num2 = n;
    }
    public Con1(float f, int k) {
        num1 = (int) f;
        num2 = k;
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Con1 obj = new Con1(8, 6);
        Con1 obj1 = new Con1();
        Con1 obj2 = new Con1(3.4f, 34);
        System.out.println(obj1.num1);

        System.out.println(obj2.num1);
        System.out.println(obj.num1 + " " + obj.num2);
    }
}
