package com.gayi;
import java.util.Scanner;
public class ReturnString2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String naam= input.next();
        System.out.println("enter the name");

        String meet= Greet(" naam");
        System.out.println(meet);
    }
    static String Greet(String name){
        String Greet= "hello"+ name;
        return Greet;
    }
}
