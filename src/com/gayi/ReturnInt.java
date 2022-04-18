package com.gayi;
import java.util.Scanner;
public class ReturnInt {
    public static void main(String[] args) {
      int ans=Sum();
      System.out.println(ans);
    }
    static int Sum(){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the num1");
        int num1= input.nextInt();
        System.out.println("enter the num2");
        int num2=input.nextInt();
        int sum= num1+num2;
        return sum;
    }
}
