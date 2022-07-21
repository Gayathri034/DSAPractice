package com.gayi.Subset;

public class SkipApple {
    public static void main(String[] args) {
        String str=skipApple("appbcda");
        System.out.println(str);
    }
    static String skipApple(String up){
        if(up.isEmpty()){
            return"";
        }
        if(up.startsWith("app")&&!up.startsWith("apple")){
            return skipApple(up.substring(3));
        }
        else{
            return up.charAt(0)+skipApple(up.substring(1));
        }
    }
}
