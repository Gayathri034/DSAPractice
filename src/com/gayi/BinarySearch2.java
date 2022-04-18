package com.gayi;
import java.util.Arrays;
public class BinarySearch2 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 88, 98};
        int target = 6;
        int ans = Binary(arr,target,0,arr.length-1);
        System.out.println(ans);
    }


    static int Binary(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] < target) {
            return Binary(arr, target, start, mid - 1);
        } else {
            return Binary (arr,target, mid + 1, end);
        }
    }
}


