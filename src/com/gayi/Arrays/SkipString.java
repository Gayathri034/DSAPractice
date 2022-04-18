package com.gayi.Arrays;

public class SkipString {
    public static void main(String[] args) {
        System.out.println(Skip("bccapplead"));
    }
    static String Skip(String up){
        if(up.isEmpty()){
            return"";
        }
        if(up.startsWith("app")&&!up.startsWith("apple")){
            return Skip(up.substring(3));
        }
        else{
            return up.charAt(0)+Skip(up.substring(3));
        }
    }
}
