package com.gayi;
import java.util.Scanner;
public class Swapvalue {
    public static void main(String[] args) {
        Changename("kunal");
        System.out.println("kunal");
    }
    static void Changename( String naam){
        naam= "rahul";
    }
    static void swap(int a,int b){
        int temp= a;
        a=b;
        b=temp;
    }
}
