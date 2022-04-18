package com.gayi;

public class RangeXOR {
    public static void main(String[] args) {
        int a=3;
        int b=9;
        int ans= Range(b)^Range(a-1);
        System.out.println(ans);


    }
    static int Range(int n){
        if(n%4==0){
            return 1;
        }
        if(n%4==1){
            return n;
        }
        if(n%4==2){
            return n+1;
        }
        if(n%4==3){
            return 0;
        }
        return-1;
    }
}
