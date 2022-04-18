package com.gayi;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 45, 56, 78, 90, 100};
        int target = 66;
        int ans = BinarySearch(arr, target);
        System.out.println(ans);
    }

    static int BinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            }
            if (target < arr[mid]) {
                end = mid - 1;
            }
            if (target == arr[mid]) {
                return mid;
            }
        }
        return -1;
    }
}
