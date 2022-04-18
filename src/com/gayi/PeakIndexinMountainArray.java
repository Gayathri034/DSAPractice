package com.gayi;

public class PeakIndexinMountainArray {
    public static void main(String[] args) {


    }
    static int Search(int[]arr,int target){
        int peak= PeakIndexinMountainArray(arr);
        int firstTry= orderAgnosticsBS(arr,target,0,peak);
                if(firstTry!=-1){
                    return firstTry;
                }
                return orderAgnosticsBS(arr,target,peak+1,arr.length-1);

    }
    static int PeakIndexinMountainArray(int[]arr){
        int start=0;
         int end =arr.length-1;
while(start<end){
    int mid=start+(end-start)/2;
    if(arr[mid]>arr[mid+1]){
        end=mid;
    }else
    {
        start=mid+1;
    }
}
return start;
    }


static int orderAgnosticsBS(int[]arr,int target,int start,int end) {

    boolean isAsc = arr[end] > arr[start];
    while (start <= end) {
        int mid = start + (end - start) / 2;
        if (target == arr[mid]) {
            return mid;
        }
        if (isAsc) {
            if (target >= arr[mid]) {
                start = mid + 1;
            }
            if (target <= arr[mid]) {
                end = mid + 1;
            }
        } else {
            if (target <= arr[mid]) {
                start = mid + 1;
            }
            if (target >= arr[mid]) {
                end = mid - 1;
            }
        }
    }
        return -1;
    }
}


