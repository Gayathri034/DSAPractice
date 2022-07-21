package com.gayi;

public class MergeSortUsingRecursion {
    public static void main(String[] args) {
int[]arr={3,5,2,1,7};
mergesort(arr,0,arr.length-1);
//        System.out.println(Arrays.toString(arr));
    }
    static void mergesort(int[]arr ,int s,int e){
        if(e-s==1){
            return;
        }
        int mid=(s+e)/2;
        mergesort(arr,s,mid);
        mergesort(arr,mid,e);
        merge(arr,s,mid,e);

    }
static void merge(int[]arr, int s, int mid, int e) {
    int[] mix = new int[e - s];
    int i = s;
    int j = e;
    int k = 0;
    while (i < mid && j < e) {
        if (arr[i] < arr[j]) {
            mix[k] = arr[i];
            i++;
        } else {
            mix[k] = arr[j];
            j++;
        }
        k++;
    }
    if (arr[i] < mid) {
        mix[k] = arr[i];
        i++;
        k++;
    }
    if (arr[j] < e) {
        mix[k] = arr[j];
        j++;
        k++;
    }
    for (int l = 0; l < mix.length; l++) {
        arr[s + l] = mix[l];

    }
}





}