package com.gayi.Arrays;
import java.util.Arrays;
public class QuickSort {
    public static void main(String[] args) {
        int[]arr={4,3,2,1};
        Quick(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void Quick(int[]arr,int l,int h){
        int s=l;
        int e=h;
        int mid=(e-s)/2;
        int p=arr[mid];
        if(l>=h){
            return;
        }
        while(s<=e){
         while(arr[s]<p){
            s++;

        }
         while(arr[e]>p){
             e--;
         }
         if(s<=e){
             int temp=arr[s];
             arr[s]=arr[e];
             arr[e]=temp;
         }

         }
        Quick(arr,l,e);
        Quick(arr,s,h);
    }
}
