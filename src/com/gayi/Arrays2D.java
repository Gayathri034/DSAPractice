package com.gayi;
import java.util.Arrays;
import java.util.Scanner;
public class Arrays2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextInt();
            }
        }
//        for(int row=0;row<arr.length;row++){
//            for(int col=0;col<arr[row].length;col++)
//            System.out.println(Arrays.toString(arr[row][col]))
//        }
//    }
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }

        System.out.println();
    }
}