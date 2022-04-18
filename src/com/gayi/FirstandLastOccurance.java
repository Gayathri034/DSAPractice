package com.gayi;

public class FirstandLastOccurance {
    public static void main(String[] args) {
        int[]nums={2,7,7,7,7,8,9};
        int target=7;
        System.out.println(Search(nums,target));
    }
    static int[] Search(int[]nums,int target){
        int [] ans={-1,-1};
        ans[0]= Search(nums,target,true);
        if(ans[0]!=1) {


            ans[1] = Search(nums, target, false);
        }
      return ans;

    }
    static int Search(int[]nums,int target,boolean firststartIndex){
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        int mid=start+(end-start)/2;
        while(start<=end){
            if(target>nums[mid]);
            {
                start=mid+1;
            }
            if(target<nums[mid]){
                end=mid-1;
            }
            else{
                ans=mid;
            }
            if(firststartIndex){
                end=mid-1;
            }
            else{
                start=mid+1;
            }


        }
return ans;
    }

}

