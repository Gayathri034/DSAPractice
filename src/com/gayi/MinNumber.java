package com.gayi;
import java.util.Arrays;
public class MinNumber {
    public static void main(String[] args) {
        int[]arr={3,4,6,76,88};
      int ans=Min(arr);
System.out.println(ans);
    }
    static int Min(int[]arr){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            int ans=arr[0];
            if(arr[i]<ans){
                return i;
            }
        }
        return -1;
    }
}
