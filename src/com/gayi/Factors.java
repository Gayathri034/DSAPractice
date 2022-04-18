package com.gayi;

public class Factors {
    public static void main(String[] args) {
        int n=30;
      Factor(n);

    }
    static void Factor(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }

    }
}
