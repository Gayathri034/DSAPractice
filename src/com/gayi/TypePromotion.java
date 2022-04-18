package com.gayi;
import java.util.Scanner;
public class TypePromotion {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=23;
        double D=32142.678;
        float F=45.6f;
        short S=2;
        byte B=42;
        long I= 34567;
        double result= (((F*D)+(S-B)*(I-num)));
        System.out.println(result);

        }
    }

