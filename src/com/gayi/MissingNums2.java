package com.gayi;
import java.util.ArrayList;
public class MissingNums2 {
    public static void main(String[] args) {
        int[]arr={4,7,8,2,3,2,1,3};
        int ans= Missing(arr);
        System.out.println(ans);
    }
    static int Missing(int[]arr){
        int i=0;
        while(arr[i]<arr.length){
            int correct=arr[i]-1;
            if(arr[i]<arr[correct])
            {
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        for(int index=0;index<arr.length;index++)
        {
            if (arr[index] != index+1) {
                return index+1;
            }
        }
            return arr.length;
        }
        static void swap(int[]arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

        }
    }

