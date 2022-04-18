package com.gayi;
import java.util.Arrays;
public class Unique {
    public static void main(String[] args) {
        int[]arr={2,3,4,2,3,5,4,6,5};
        int ans= Find(arr);
        System.out.println(ans);
    }
    static int Find(int[]arr){
        int unique=0;
        for(int n:arr){
            unique^=n;
        }
        return unique;
    }
}
