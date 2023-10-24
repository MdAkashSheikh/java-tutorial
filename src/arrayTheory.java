class Student {
    int roll;
    String name;
}

public class arrayTheory {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();

        Student s[] = { s1, s2, s3, s4 };

        int num[] = new int[4];
        num[0] = 3;
        num[1] = 12;
        num[2] = 31;
        num[3] = 80;

        for(int i=0; i<4; i++) {
            System.out.println(i+1 + "-> " + num[i]);
        }
    }
}
