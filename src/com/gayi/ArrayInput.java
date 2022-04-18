package com.gayi;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayInput {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0; i<arr.length; i++){
            arr[i]=input.nextInt();
            
        }
        for(int num:arr){
            System.out.print(num);
        }
    }
}
