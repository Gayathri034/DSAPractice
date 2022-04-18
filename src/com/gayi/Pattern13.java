package com.gayi;

public class Pattern13 {
    public static void main(String[] args) {
        int n=5;
        Pattern(5);

    }
    static void Pattern(int n){
        for(int row=1;row<=n;row++){
            for(int col=0;col<=n;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
