package com.gayi;

public class NoofDigits2 {
    public static void main(String[] args) {
        int n=10;
        int b=2;
//        while(n>0){
            int ans= (int)(Math.log(n)/Math.log(b))+1;
            System.out.println(ans);
        }
//    }
}
