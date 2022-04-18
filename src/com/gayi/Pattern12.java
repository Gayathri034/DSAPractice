package com.gayi;

public class Pattern12 {
    public static void main(String[] args) {
//        int n=4;
        Pattern(4);
    }

    static void Pattern(int n) {
        for (int row = 1; row < n; row++) {
            for (int col = 1; col <= row; col++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
}
