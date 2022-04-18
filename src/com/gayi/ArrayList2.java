package com.gayi;
import java .util.Scanner;
import java.util.ArrayList;
public class ArrayList2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=0;i<3;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(input.nextInt());
            }
        }
        System.out.println(list);
    }
}
