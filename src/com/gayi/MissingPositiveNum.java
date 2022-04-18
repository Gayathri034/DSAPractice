package com.gayi;
import java.util.Arrays;
public class MissingPositiveNum {
    public static void main(String[] args) {
        int[]arr={1,-1,3,4};
        int ans=Missing(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int Missing(int[]arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]>0&&arr[i] <=arr.length&&arr[i]!=arr[correct])
            {
                swap(arr,i,correct);

            }else{
                i++;
            }
        }
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=arr[index+1]) {
                return index + 1;

            }
        }return arr.length+1;
    }
    static void swap(int[]arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
