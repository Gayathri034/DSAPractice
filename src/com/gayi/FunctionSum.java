package com.gayi;
import java.util.Scanner;
public class FunctionSum {
    public static void main(String[] args) {
        sum();
    }
        static void sum(){
            Scanner input=new Scanner(System.in);

                int num1= input.nextInt();
                System.out.println("enter the num1");
                int num2= input.nextInt();
                System.out.println("enter the num2");
int sum=num1+num2;
System.out.println(sum);
        }
    }

