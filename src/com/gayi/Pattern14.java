package com.gayi;

public class Pattern14 {
    public static void main(String[] args) {
        int n=5;
        Pattern(5);
    }
    static void Pattern(int n){
        for(int row=0;row<=n;row++){
            for(int col=0;col<=n-row+1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
