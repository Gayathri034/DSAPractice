package com.gayi;
import java.util.Scanner;
public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int empid= input.nextInt();
        String Department=input.next();
        switch(empid){
            case 1:
                System.out.println("rahul");
                break;
            case 2:
                System.out.println("gayathri");
                break;
            case 3:
                System.out.println("hi prends");{
                    switch(Department){
                        case "IT":
                            System.out.println("it department");
                            break;
                        case "MECH":
                            System.out.println("mechanical department");
                            break;
                        default:
                            System.out.println("incorrect department");
                        break;
                    }}
                default:
                    System.out.println("byee prends");

        }
    }
}
