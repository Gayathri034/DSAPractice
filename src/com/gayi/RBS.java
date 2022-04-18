package com.gayi;

public class RBS {
    public static void main(String[] args) {
        int[] num = {2, 3, 5, 6, 7, 0, 1};
        int target = 6;
        System.out.println(findPivot(num, target));
    }

    static int Search(int[] arr, int target) {
        int pivot = findPivot(arr,target);
        if (pivot == -1) {
            return BinarySearch(arr, target, 0, arr.length- 1);
        }
        if (arr[pivot] == target) {
            return pivot;
        }
        if (target >= arr[0]) {
            return BinarySearch(arr, target, 0, pivot - 1);

        } else {
            return BinarySearch(arr, target, pivot + 1, arr.length-1);
        }
    }
    static int BinarySearch(int[]arr,int target,int start,int end)
    {
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target>=arr[mid])
            {
                start=mid+1;
            }
            if (target<=arr[mid])
            {
                end=mid-1;
            }


        }
        return -1;
    }
    static int findPivot(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= start) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;

    }
}

