package com.gayi;
import java.util.Arrays;
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 65, 88, 90, 43, 56, 77};
        int target = 88;
        int ans = Search(arr, target);
        System.out.println((ans));
    }

    static int Search(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}
