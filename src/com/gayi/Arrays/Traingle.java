package com.gayi.Arrays;

public class Traingle {
    public static void main(String[] args) {
        traingle(4,3);
    }
    static void traingle(int r,int c){
        if(r==0)
        {
            return;
        }
        if(c<r){
            System.out.print("*");
            traingle(r,c-1);
        }
        else{
            System.out.println();
            traingle(r-1,0);
        }

    }
}
