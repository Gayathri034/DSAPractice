package com.gayi.Arrays;

public class Sorted {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        boolean ans=Sort(arr,0);
        System.out.println(ans);
    }



    static boolean Sort(int[]arr,int index){
        if(index==arr.length-1){
            return true;
        }
        return (arr[index]<arr[index-1]&& Sort(arr,index+1));
    }
}
