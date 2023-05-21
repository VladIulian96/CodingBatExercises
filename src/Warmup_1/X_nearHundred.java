package Warmup_1;

public class X_nearHundred {

//    Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.

    public static void main(String[] args) {
        System.out.println(new X_nearHundred().nearHundred(100));
    }

    public boolean nearHundred(int n) {
        return Math.abs(n) > 10 && (Math.abs(n) < 100);
    }


}
