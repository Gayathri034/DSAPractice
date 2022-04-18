package com.gayi;
import java.util.Arrays;
public class SelectionSort2 {
    public static void main(String[] args) {
        int[]arr={5,8,4,2,1};
        Selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Selection(int[]arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
//            int start = 0;
            int max = getMaxIndex(arr, 0 ,last);
            Swap(arr, max, last);
        }
    }
        static void Swap(int[]arr,int first,int second){
        int temp= arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    static int getMaxIndex(int[] arr,int start, int last){
        int max= 0;
        for(int i = 0; i<last; i++){
            if(arr[max]<arr[i]){
                max= i;
            }
        }
return -1;
    }
}
