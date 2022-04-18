package com.gayi;
import java.util.Arrays;
public class LinearSearch2 {
    public static void main(String[] args) {
        int[]arr={1,56,77,98,66,58};
        int target=78;
        int ans= Search(arr,target);
        System.out.println(ans);
    }
    static int Search(int[]arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int element:arr){
            if(element==target){
                return target;
            }
        }
        return -1;
    }
}
