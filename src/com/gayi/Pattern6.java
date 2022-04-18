package com.gayi;

public class Pattern6 {
    public static void main(String[] args) {
        Pattern(8);
    }
    static void Pattern(int n){
        for(int row=0;row<2*n;row++) {
            int ColinRow = 0;
            int space = n - ColinRow;

            for (int s = 0; s <  space; s++) {
                System.out.print("");
            }
            ColinRow = row > n ? 2 * n - row : row;
            for (int col = 0; col < ColinRow; col++) {

            }

        }

    }
}
