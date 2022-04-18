package com.gayi;
import java.util.Scanner;
public class IsPrime {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        boolean ans= IsPrime(num);
        System.out.println(ans);
    }
    static boolean IsPrime(int num){
        if(num<=1){
            return false;
        }
        int c=2;
        while(c*c<=num){
            if(num%c==0){
                return false;
            }
            c++;

        }
        if(c*c>num){
            return true;
        }
        return false;
    }
}
