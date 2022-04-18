package com.gayi.Arrays;

public class SipString {
    public static void main(String[] args) {
        System.out.println(Skip("bcappled"));
    }
    static String Skip(String up){
        if(up.isEmpty()){

        }
        char ch= up.charAt(0);
        if(up.startsWith("apple")){
            return Skip(up.substring(5));
        }
        else{
            return ch+Skip(up.substring(5));
        }
    }
}
