package com.gayi;

public class Reverse4 {
    static int sum=0;
    public static void main(String[] args) {
int ans=rev(1456);
        System.out.println(ans);

    }
    static int rev(int n){
        int digits= (int)(Math.log10(n))+1;
        return helper(n,digits);

    }
    static int helper(int n,int digits){
        if(n%10==n){
            return n;
        }
        int rem= n%10;

        return rem*(int) Math.pow(10,digits-1) + helper(n/10,digits-1);
    }
}
