package com.gayi;

public class Floor{
    public static void main(String[] args) {


        int[] arr = {2, 3, 7, 9, 14, 16, 18};
        int target = 8;
        int ans = Floor(arr, target);
        System.out.println(ans);
    }

    static int Floor(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        while (start <= end) {
            if (target >=arr[mid]) {
                start = mid + 1;
            }
            if (target <= arr[mid]) {
                end = mid - 1;
            }
             if(target==arr[mid]){
                 return mid;

                 
            }

        }
return end;
    }
}


