package com.gayi;
import java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args) {
        int[]arr={3,4,5,23,44};
        Reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Reverse(int[]arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }

     static void swap(int[] arr, int start, int end) {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
