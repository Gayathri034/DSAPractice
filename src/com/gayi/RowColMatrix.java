package com.gayi;
import java.util.Arrays;
public class RowColMatrix {
    public static void main(String[] args) {


        int[][] arr = {
                {21,22,23,24},
                {25,26,27,28},
                {29,30,31,32},
                {33,34,35,36},
        };
        System.out.println(Arrays.toString(search(arr, 35)));
    }
    static int[] search(int[][]matrix, int target){
        int r=0;
        int col=matrix.length-1;

        while (r< matrix.length && col>=0) {
            if (matrix[r][col]==target) {
                return new int[]{r,col};

            }
            if(target>matrix[r][col])
            {
                r++;
            }
            else{
                col--;
            }

        }
        return new int[]{-1,-1};
    }
}
