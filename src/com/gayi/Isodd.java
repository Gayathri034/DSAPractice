package com.gayi;

public class Isodd {
    public static void main(String[] args) {
        Boolean ans=odd(35);
        System.out.println(ans);
    }
    static boolean odd(int n){
        if((n&1)==1){
            return true;
        }
        return false;
    }
}
