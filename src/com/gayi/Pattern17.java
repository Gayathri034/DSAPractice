package com.gayi;

public class Pattern17 {
    public static void main(String[] args) {
        int n=10;
        Pattern(10);

    }
    static void Pattern(int n){
        for(int row=0;row<n;row++){
            for(int space=0;space<n-row;space++){
                System.out.print("");
            }
            for(int col=row;col>1;col--){
                System.out.print(col +" ");
            }
            for(int col=2;col<=row;col++){
                System.out.print(col +" ");
            }
            System.out.println();
        }
    }
}
