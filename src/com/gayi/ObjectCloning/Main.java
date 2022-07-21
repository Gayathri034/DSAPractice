package com.gayi.ObjectCloning;

public class Main {
    public static void main(String[] args)throws CloneNotSupportedException {


        Human kunal = new Human( "kunalKushwaha",34);
        Human twin = (Human)kunal.clone();
        System.out.println(twin.age + "" + twin.name);
    }
    
}
