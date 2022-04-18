package com.gayi;

public class Pattern1{
    public static void main(String[] args) {
        boolean b = Pattern1(4);
    }
    static boolean Pattern1(int n)
    {
        for(int row=0;row<= n;row++) {
            for (int col = 0; col <=row; col++) {
                System.out.print(col);
            }


            System.out.println();
        }

        return false;
    }
}
