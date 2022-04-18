package com.gayi;

public class Squareroot2 {
    public static void main(String[] args) {
int n=37;
int p=3;
double ans=root(n,p);
        System.out.println(ans);
    }
    static double root(int n,int p){
        int start=0;
        int end=n;
        double root=0.0;
        while(start<=end){
            int mid=start+(end-start/2);
            if (mid*mid==n){
                return mid;
            }
            if(mid*mid>n){
                end=mid-1;
            }
            else{
                start=mid+1;



            }
            int increment=0;
            for(int i=0;i<=p;i++){
                while(root*root<=n){
                    root=root+increment;
                }
root=root-increment;
                increment=increment/10;
            }
        }
        return root;
    }
}
