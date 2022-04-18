package com.gayi;
import java.util.Arrays;
public class OrderAgnostics {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,899};
        int target=6;
        int ans=Order(arr,target);
        System.out.println(ans);
    }
    static int Order(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        boolean IsAsc= arr[start]<arr[end];
        while(arr[start]<=arr[end]){
            int mid= start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(IsAsc) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
               else{
                   if(arr[mid]>target){
                       start=mid+1;
                   }
                   else{
                       end=mid-1;
                   }
                }



        }
        return -1;
    }
}
