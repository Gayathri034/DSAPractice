package com.gayi.Arrays;
import java.util.ArrayList;
public class ReturnSub {
    public static void main(String[] args) {
        System.out.println(SubSeq("","abc"));
    }
    static ArrayList<String> SubSeq(String p,String up){
        if(up.isEmpty()){
             ArrayList<String>list=new ArrayList<>();
            System.out.println(p);
            return list;
        }
        char ch= up.charAt(0);
        ArrayList<String> left= SubSeq( p+up,up.substring(1));
        ArrayList<String>right=SubSeq(p,up.substring(1));
        ArrayList<String> third=SubSeq(p+(ch+0),up.substring(1));

        right.addAll(left);
        right.addAll(third);
        return right;
    }
}
