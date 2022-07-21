package com.gayi.Sorting;
import java.util.Arrays;
public class QuickSort {
    public static void main(String[] args) {
int[]arr={4,6,8,3,1,2};
quick(arr,0,arr.length-1);
    }
    static void quick(int[]arr,int low,int hi){
        if(low>=hi){
            return;
        }
        int s= low;
        int e=hi;
        int mid=s+(e-s)/2;
        int pivot= arr[mid];
        while(s<=e){
            while(arr[s]<pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp= arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
            quick(arr,low,e);
            quick(arr,s,hi);





        }
    }
}
