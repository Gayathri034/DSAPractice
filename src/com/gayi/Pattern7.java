package com.gayi;

public class Pattern7 {
    public static void main(String[] args) {
        Pattern(6);

    }
    static void Pattern(int n){
        for(int row=0;row<=n;row++){
            int space=n-row;
            for(int s=0;s< n-row;s++){
                System.out.print("");
            }
            for(int col=row;col>=1;col--){
                System.out.print(col+" ");
            }
            for(int col=2;col<=row;col++){
                System.out.print(col+" ");
            }
System.out.println();
        }
    }
}
