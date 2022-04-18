package com.gayi;

public class Pattern15 {
    public static void main(String[] args) {
        int n=10;
        Pattern(10);
    }
    static void Pattern(int n){
        for(int row=0;row<=n;row++){
            for(int col=0;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
