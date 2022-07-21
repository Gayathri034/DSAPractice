package com.gayi.Sorting;

import java.sql.SQLOutput;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
int[]arr={3,5,2,4,1};
arr= mergesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int []mergesort(int[]arr){
        if(arr.length==1) {
            return arr;
        }
        int mid= arr.length/2;
        int[]left=mergesort(Arrays.copyOfRange(arr,0,mid));
        int[]right=mergesort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    static int[]merge(int[]first,int[]second){
        int[]mix=new int[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<first.length&&j<second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;


            } else {

                mix[k] = second[j];
                j++;

            }
            k++;
        }
            if(mix[i]<first.length){
                first[i]=mix[k];
                i++;
                k++;
            }
            if(mix[j]<second.length){
                second[j]=mix[k];
                j++;
                k++;
            }

        return mix;
    }
}
