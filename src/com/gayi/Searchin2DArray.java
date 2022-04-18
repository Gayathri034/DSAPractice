package com.gayi;
import java.util.Arrays;
public class Searchin2DArray {
    public static void main(String[] args) {
        int[][]arr={
                {1,2,3},
        {4,5,6,7},
        {9,19},
        };
        int target=7;
        int[]ans= Search(arr,target);
        System.out.println(Arrays.toString(ans));
        }
        static int[] Search(int[][]arr,int target){
        if(arr.length==0){
            return new int[]{-1,-1};
        }
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};

    }
}
