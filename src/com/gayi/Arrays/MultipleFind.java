package com.gayi.Arrays;
import java.util.ArrayList;
public class MultipleFind {
    public static void main(String[] args) {
        int[]arr={2,1,3,4,4,5,6};
        int target=4;
         Search(arr,target,0);
        System.out.println(List);


    }
    static ArrayList<Integer> List= new ArrayList<>();
    static void Search(int[]arr,int target,int index){
        if(index==arr.length){
           return ;
        }
        if(arr[index]==target){
             List.add(index);
        }
        else{
            Search(arr,target,index+1);
        }
    }
}
