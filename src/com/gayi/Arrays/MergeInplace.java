package com.gayi.Arrays;
import java.util.Arrays;
public class MergeInplace {
    public static void main(String[] args) {
        int[]arr={4,3,2,1};
        merge(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void merge(int[]arr,int s,int e){
        if(e-s==1){
            return;
        }
        int mid=s+e/2;
        merge(arr,s,mid);
        merge(arr,mid,e);
        mergesort(arr,s,e,mid);
    }
    static void mergesort(int[]arr,int s,int e,int m){
        int[]mix= new int[e-s];
        int i=s;
        int j=m;
        int k=0;
       while(i<m&&j<e){
           if(arr[i]<arr[j]){
               mix[k]=i;
               i++;
           }
           else{
               mix[k]=j;
               j++;
           }
           k++;

       }
       while(i<m){
           mix[k]=arr[i];
           i++;
       }
       while(j<e){
           mix[k]=arr[j];
           j++;
       }
    }
}
