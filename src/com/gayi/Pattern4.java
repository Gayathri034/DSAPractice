package com.gayi;

public class Pattern4 {
    public static void main(String[] args) {
        Pattern(5);

    }
    static void Pattern(int n){
        for(int row=0;row<2*n;row++){

            int Colno=row>n ?2*n-row:row;

            for(int col=0;col<Colno;col++){
                System.out.print(col);
            }
        }
        System.out.println();
    }
}
