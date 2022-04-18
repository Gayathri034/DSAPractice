package com.gayi;
import java.util.Arrays;
public class MaxvalueRange {
    public static void main(String[] args) {
        int[]arr={1,3,43,87,44};
        Maxvalue(arr,1,3);
        System.out.println(Arrays.toString(arr));
    }
    static void Maxvalue(int[]arr,int start,int end){
         int Maxvalue=arr[start];
        for(int i=start;i<end;i++){
            if(arr[i]>Maxvalue){
                Maxvalue=arr[i];
            }
        }

    }
}
