package com.akash;

public class ExceptionDemo {
    public static void main(String[] args) {
        int i, j;
        i=8;
        j=9;

        try{
            int k = i/j;
            if(k == 0)
                throw new AkashException("this is not possible");
            System.out.println(k);
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
