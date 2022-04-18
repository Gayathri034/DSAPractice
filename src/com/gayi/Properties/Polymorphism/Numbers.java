package com.gayi.Properties.Polymorphism;

public class Numbers {
    double sum(double a,double b){
        return a+b;
    }
    int sum(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        Numbers obj=new Numbers();
        obj.sum(2,8);
    }
}
