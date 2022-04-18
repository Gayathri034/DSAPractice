package com.gayi;

public class OddEven {
    public static void main(String[] args) {


        int ans = 31;
        System.out.println(Isodd(ans));
    }
    static boolean Isodd(int n) {
        if ((n & 1) == 1) {
            return true;
        }
        return false;
    }
}
