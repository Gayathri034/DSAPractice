package com.gayi.Subset;

public class SkipAChar2 {
    public static void main(String[] args) {
        String str= skip2("bacda");
        System.out.println(str);
    }



    static String skip2(String up){
        if(up.isEmpty()){
            return"";
        }
        char ch= up.charAt(0);
        if(ch=='a'){
            return skip2 (up.substring(1));
        }
        else{
            return ch+skip2(up.substring(1));
        }
    }

    
}
