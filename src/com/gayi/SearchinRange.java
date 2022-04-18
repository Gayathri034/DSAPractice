package com.gayi;
import java.util.Arrays;
public class SearchinRange {
    public static void main(String[] args) {
        int[]arr={1,56,78,89,90,53};
        int target=56;
        System.out.println(Linearsearch(arr,target,2,5));
    }
    static boolean Linearsearch(int[]arr,int target,int start,int end){
        if(arr.length==0){
            return false;
        }
        for(int i=start;i<=end;i++){
            if(target==i){
                return true;
            }

        }
        return false;
    }
}
