package com.gayi;
import java.util.Arrays;
public class Swap2 {
    public static void main(String[] args) {
        int[]arr={1,34,56,87,66};
        swap(arr,1,3);
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int[]arr,int index1,int index2){
        int temp= arr[1];
        arr[1]=arr[3];
        arr[3]=temp;
    }
}
