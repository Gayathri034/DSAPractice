package com.gayi;

public class RotatingCount {
    public static void main(String[] args) {
        int[]arr={1,3,4,6,7,2,3};
        System.out.println(RotatingCount(arr));
    }
    static int RotatingCount(int[]arr){
        int pivot=findPivot(arr);
        return pivot+1;
    }
    static int findPivot(int[]arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid] >= arr[mid+1]) {
                return mid;

            }
                if (arr[mid]<arr[mid-1]) {
                    return mid-1;

                }
                if(arr[mid]<=start){
                    end=mid-1;
            }
                else
                {
                    start=mid+1;
                }
        }
        return -1;
    }
}
