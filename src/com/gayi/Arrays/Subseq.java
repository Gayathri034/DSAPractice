package com.gayi.Arrays;

public class Subseq {
    public static void main(String[] args) {
        Sub("","abc");
    }
    static void Sub(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        Sub(p+up,up.substring(1));
        Sub(p,up.substring(1));

    }
}
