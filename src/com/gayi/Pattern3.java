package com.gayi;

public class Pattern3 {
    public static void main(String[] args) {
        Pattern3(4);

    }
    static void Pattern3(int n){
        for(int row=0;row<=n/2;row++){
            for(int col=0;col<=row/2;col++){
                System.out.print(col);

            }
        }
    }
}
