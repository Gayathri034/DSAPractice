package com.gayi.Arrays;

public class SkipReturn {
    public static void main(String[] args) {
        System.out.println(Skip("bccad"));
    }
    static String Skip(String up){
        if(up.isEmpty()){
//            System.out.println(p);
//            return p;
        }
        char ch= up.charAt(0);
        if(ch=='a'){
            return Skip(up.substring(1));
        }
        return  ch+Skip(up.substring(1));
    }

//    private static String Skip(String substring) {
    }
//}
