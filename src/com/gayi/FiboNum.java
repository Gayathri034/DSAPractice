package com.gayi;

public class FiboNum {
    public static void main(String[] args) {
        int ans = Fibonum(7);
        System.out.println(ans);
    }

    static int Fibonum(int n) {
        return (int) ((int) (Math.pow(((Math.sqrt(5) + 1) / 2), n) + Math.pow(((Math.sqrt(5) - 1) / 2), n)) / Math.sqrt(5));
    }

    static int fibo(int n) {
        if (n < 2) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}

