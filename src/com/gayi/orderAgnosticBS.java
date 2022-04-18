package com.gayi;

public class orderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 5, 8, 18, 19, 34, 56, 68, 79, 89, 93};
        int[] arr={99,87,76,65,54,43,32,21,10,9,7,5,3,1};
        int target = 11;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int[]arr,int target)
    {
        int start=0;
        int end=arr.length-1;

        boolean isAsc=arr[end]>arr[start];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target>arr[mid]){
                    start=mid+1;
                }
                if(target<arr[mid]){
                    end=mid-1;
                }
            }
            else{
                if(target>arr[mid]){
                    end=mid-1;
                }
                if(target<arr[mid]){
                    start=mid+1;

                }

            }

        }
        return -1;

    }
}
