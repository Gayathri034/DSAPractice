package com.gayi;
import java.util.Scanner;
public class Methodoverloading {
    public static void main(String[] args) {
        fun(2,3);

    }
    static void fun(int a,int b)
    {
        System.out.println(a+b);
    }
    static void fun(String a){
        System.out.println("a");
    }

}
