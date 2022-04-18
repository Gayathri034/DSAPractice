package com.gayi;
import java.util.Arrays;
public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 3, 1, 2};
        int[] ans = DuplicateAndMissing(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] DuplicateAndMissing(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return new int[]{arr[index],index+1} ;
            }
        }
        return new int []{-1,-1};
    }
    static void swap(int[]arr,int first,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
}

}
