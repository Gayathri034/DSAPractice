package com.gayi;

public class Pattern16 {
    public static void main(String[] args) {
        int n= 10;
        Pattern(10);

    }
    static void Pattern(int n){
        for(int row=0;row<2*n;row++){
            int totalcolinrow= row>n? 2*n-row:row;
            int noofspace= n-totalcolinrow;
            for(int s=0;s<noofspace;s++){
                System.out.print("");
            }
            for(int col=0;col<totalcolinrow;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
