package com.gayi;

public class NewRaphson {
    public static void main(String[] args) {
        int n=45;
        System.out.println(root(40));

    }
    static double root(double n) {
        double x = n;
        double root;
        while (true) {


            root = ((x+n/x)*0.5);
            if(Math.abs(root-x)<1){
                break;
            }
            root=x;
        }
        return root;
    }
}
