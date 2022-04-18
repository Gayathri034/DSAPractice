package com.gayi;
import javax.management.remote.rmi._RMIConnection_Stub;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int ans=0;
        while(true){
            char op= input.next().trim().charAt(0);
            System.out.println("enter the operator");
            if(op=='+'|| op=='-'|| op=='*'|| op=='%'|| op=='/'){
                System.out.println("enter the numbers ");
                int num1=input.nextInt();
//                System.out.println("enter the num1");
                int num2= input.nextInt();
//                System.out.println("enter the num2");
                if(op=='+')
                {
                    System.out.println(num1+num2);
                }
                if (op == '-') {
                    System.out.println(num1-num2);
                }
                if(op=='*'){
                    System.out.println(num1*num2);
                }
                if(op=='%' && num2>num1){
                    System.out.println(num1%num2);
                }
                else if (op=='x'){
                    break;
                }
                else{
                    System.out.println("enter the valid operator");
                }
            }
        }
    }
}
