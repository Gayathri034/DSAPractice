package com.gayi;
import java.util.Arrays;
public class BinarySearchIn2DArray {
    public static void main(String[] args) {
        int[][]arr={{10,20,30,40},
                {15,25,35,45},
                {28,29,38,49},
                {33,34,38,50}};
        int target=38;
        int[] ans= Binary(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] Binary(int[][]arr,int target){
        int row=0;
        int col=arr.length;
        while(row<arr.length&&col>=0){
            if(arr[row][col]==target){
                return new int[]{row,col};
            }
            if(arr[row][col]>target){
                col--;
            }else{
                row++;
            }
        }
        return new int[]{-1,-1};
    }
}
