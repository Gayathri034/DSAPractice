package com.gayi;
import java.util.Arrays;
public class MinInArrays {
    public static void main(String[] args) {
        int[][]arr={{1,2,3,4},
                {5,6,7},
                {8,9,10},

        };
        int[]ans= Max(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] Max(int[][]arr){
        if(arr.length==0){
            return new int[]{-1,-1};

    }
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                int max= Integer.MIN_VALUE;
                if (arr[row][col]>max) {
                    return new int[]{row,col};

                }
                }
            }
        return new int[]{-1,-1};
        }
}
