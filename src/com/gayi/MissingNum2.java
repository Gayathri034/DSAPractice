package com.gayi;
import java.util.Arrays;
public class MissingNum2 {
    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 1};
        int ans = Missing(arr);
        System.out.println(Arrays.toString(arr));

    }

    static int Missing(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] != arr[correct] && arr[i] < arr.length) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }

        }
        return arr.length;
    }
        static void swap(int[]arr,int start,int end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
    }

