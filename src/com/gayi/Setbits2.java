package com.gayi;

public class Setbits2 {
    public static void main(String[] args) {
        int n=45;
//        System.out.println(Integer.toBinaryString(n));
        int ans=Set(n);
        System.out.println(ans);
    }
    static int Set(int n){
        int count=0;
        while(n>0){
            n=n-(n&(n-1));
            count++;
        }
        return count;
    }
}
