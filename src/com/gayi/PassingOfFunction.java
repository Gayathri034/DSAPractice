package com.gayi;

import java.util.Arrays;

public class PassingOfFunction {
    public static void main(String[] args) {
        int[] num={2,4,8,68,90};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
    }
    static void change(int[]arr){
        arr[0]=45;
    }
}
