class Emp {
    int eid;
    int salary;
    static String ceo;

    public Emp() {
        eid = 101;
        salary = 5000;
        System.out.println("In Constractor");
    }

    static {
        ceo = "Mukhles";
        System.out.println("In Static");
    }

    public void show() {
        System.out.println(eid + " : " + salary + " : " + ceo);
    }
}

public class staticDemo {
    public static void main(String[] args) {
        Emp rahim = new Emp();
        Emp nabin = new Emp();
        Emp raju = new Emp();

        rahim.eid = 3;
        rahim.salary = 3000;


        nabin.eid = 4;
        nabin.salary = 5000;

       rahim.show();
       nabin.show();
       raju.show();

    }
}
