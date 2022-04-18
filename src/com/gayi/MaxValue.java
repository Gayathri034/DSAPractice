package com.gayi;
import java.util.Arrays;
public class MaxValue {
    public static void main(String[] args) {
        int[] arr = {1, 33, 56, 57, 34};
        max(arr);
        System.out.println(arr);
    }

    static void max(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int max = arr[0];
            if (arr[i] > max) {
                 max=arr[i];
            }
        }
    }
}