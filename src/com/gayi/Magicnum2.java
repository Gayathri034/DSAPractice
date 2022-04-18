package com.gayi;

public class Magicnum2 {
    public static void main(String[] args) {
        int ans=0;
        int n=6;
        int base=5;
        while(n>0){
            int last=n&1;
            n=n>>1;
            ans=ans+base*last;
            base=base*5;
        }
        System.out.println(ans);
    }
}
