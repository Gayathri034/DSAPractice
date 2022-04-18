package com.gayi;
import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String fruit = input.next();
        switch (fruit) {
            case "Apple":
                System.out.println("A sweet red fruit");
                break;
            case "Mango":
                System.out.println("King of the fruits");
                break;
            default:
                System.out.println("enter the valid fruit name");
                break;
        }
    }
}
