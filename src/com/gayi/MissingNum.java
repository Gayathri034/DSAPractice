package com.gayi;

public class MissingNum {

    public static void main(String[] args) {
        int[] arr = {4,2, 0, 1};
        int ans= Missing(arr);
        System.out.println(ans);
    }

    static int Missing(int[] arr) {
        int i = 0;
        while (i < arr.length) {

            int correct = arr[i];
            if ( arr[i] < arr.length&& arr[i] != arr[correct])
            {
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


        static void swap ( int[] arr, int i, int correct){
            int temp = arr[i];
            arr[i] = arr[correct];
            arr[correct] = temp;

        }
    }



