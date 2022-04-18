package com.gayi;

public class GCD {
    public static void main(String[] args) {
        int ans = Gcd(3, 9);
        System.out.println(ans);
    }

    static int Gcd(int a, int b) {
        if (a == 0) {
            return b;

        }
        return Gcd(b / a, a);
    }
}
