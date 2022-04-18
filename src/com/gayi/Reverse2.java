package com.gayi;

public class Reverse2 {
    static int sum = 0;

    //    public static void main(String[] args) {
//        Rev(4321);
//        System.out.println(sum);
//    }
    static void Rev(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        n = n / 10;
//        System.out.println(sum);
    }

    public static void main(String[] args) {
        Rev(4321);
        System.out.println(sum);
    }
}
