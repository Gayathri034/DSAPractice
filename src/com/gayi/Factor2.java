package com.gayi;
import java .util.ArrayList;
public class Factor2 {
    public static void main(String[] args) {
        int n;
        Fac(20);

    }
    static void Fac(int n){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==i){
                System.out.println(i);
            }
            else{
                System.out.println(i);
                list.add(n/i);
            }
        }

    for(int i=list.size();i>=0;i--){
        System.out.println(list.get(i));
    }
}
}
