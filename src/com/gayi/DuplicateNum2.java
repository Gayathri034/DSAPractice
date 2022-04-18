package com.gayi;
import java.util.ArrayList;

public class DuplicateNum2 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1, 3, 2, 7, 8};
        int ans = (int) Duplicate(arr);
        System.out.println(ans);
    }

    static Object Duplicate(int[] arr) {
        int i = 0;
        while (arr[i] < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
            ArrayList<Integer> ans = new ArrayList<>();
            for (int index = 0; index < arr.length; index++) {
                if (arr[index] != index + 1) {
                    ans.add(index + 1);

                }
//                ans.add(arr.length);
            }
            return ans;
        }
        return null;
    }


        static void swap ( int[] arr, int first, int second){
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }

    }




