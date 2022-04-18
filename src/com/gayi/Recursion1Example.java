package com.gayi;

public class Recursion1Example {
    public static void main(String[] args) {
//        int n = 0;
//        if(n==6){
//            System.out.println(6);
//            return;
        num(1);
        }
//    }
    static void num(int n){
        if(n==6){
            System.out.println(6);
            return;
        }

        System.out.println(n);
        num(n+1);
    }
}
