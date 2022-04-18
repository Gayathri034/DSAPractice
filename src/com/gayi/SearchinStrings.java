package com.gayi;
import java.util.Arrays;
public class SearchinStrings {
    public static void main(String[] args) {


        String str = "kunal";
        char target = 'u';
        boolean ans= Search(str,target);
    }
    static boolean Search(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(target== str.charAt(0)){
                return true;
            }
        }
        return false;
    }
}
