package com.gayi;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] nums ={1,2,3,5,45,46,76,89,113,145,156};
        int target=5;
        System.out.println(ans(nums,target));
    }
    static int ans(int[]nums, int target ) {
        int start = 0;
        int end = 1;
//        condition for target to lie in the range
        while (target > nums[end]) {
            int temp= end + 1;
            end = end + (end - start + 1) * 2;
             start= temp;
        }
        return Search (nums,target,start,end);
    }

    static int Search(int[]nums, int target,int start,int end){
        while(start<=end){
            int mid= start+(end-start)/2;
            if(target> nums[mid]){
                start=mid+1;


            }
            if(target<nums[mid]){
                end=mid-1;
            }else{
                return mid;
            }
        }
return -1;
    }
}
