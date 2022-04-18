package com.gayi.Arrays;
import java.util.Arrays;
public class SelectionSortViaRecursion {
    public static void main(String[] args) {
        int[]arr={4,3,2,1};
        Selection(arr,arr.length-1,0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void Selection(int[]arr,int r,int c,int max){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[max]<arr[c]){
                Selection(arr,r,c+1,c);
            }
            else{
                Selection(arr,r-1,0,max);
            }

        }
        else{
            int temp=arr[max];
            arr[max]=arr[r-1];
            arr[r-1]=temp;
        }

    }
}
