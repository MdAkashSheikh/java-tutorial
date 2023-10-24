class Nai{
    String st = "Se nai";
}

public class Main {
    public static void main(String[] args) {
        Nai kosto = new Nai();

        System.out.println(kosto.st);

        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5; j++) {
                if(i == 1 || i == 5) {
                    System.out.print("*  ");
                } else if(j==1 || j==5){
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
