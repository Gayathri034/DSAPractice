package com.gayi.Arrays;

public class Find {
    public static void main(String[] args) {
        int[]arr={1,2,4,5,6,8};
        int target=6;
        Find(arr,6,0);
    }
    static boolean Find(int[]arr,int target,int index){
        if(index==arr.length){
            return false;
        }
        return (arr[index]==target||Find(arr,6,index+1));

    }
    static int FindIndex(int[]arr,int target,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else{
            return FindIndex(arr,target,index+1);
        }
    }
}
