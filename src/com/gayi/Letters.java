package com.gayi;

public class Letters {
    public static void main(String[] args) {
    }
    static char Letters(char[]Letters,char target){
        int start=0;
        int end = Letters.length-1;
        int mid=start+(end-start)/2;
        while(start<=end)
        {
            if(target < Letters[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }


        }
        return Letters[start% Letters.length];
    }
}
