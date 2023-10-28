package com.akash;

public class Demo {
    public static void main(String[] args) {
        try {
            int a[] = new int[6];
            a[6] = 8;
            int i = 10;
            int j = 0;
            int k = i/j;
            System.out.println("Output is: " + k);
        }
        catch (ArithmeticException e) {
            System.err.println("Cannot divide by Zero");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Stay in your limit...");
        }
        finally {
            System.out.println("Bye");
        }
    }
}
