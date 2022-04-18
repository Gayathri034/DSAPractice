package com.gayi;

public class MaxWealth {
    public static void main(String[] args) {


    int[][]arr={{1,2},
            {3,4},
            {5,6}};
    int num= Max(arr);
    System.out.println(num);
}
static int Max(int[][]arr) {

    int ans = Integer.MIN_VALUE;
    for (int person = 0; person < arr.length; person++) {
        int sum=0;
        for (int account = 0; account < arr[person].length; account++) {
            sum = sum + arr[person][account];
        }

    if (sum > ans) {
        ans = sum;
    }
}
        return ans;
    }
}
