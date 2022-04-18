package com.gayi;
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayList1 {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<>();
//        list.add(67);
//        list.add(87);
//        list.add(78);
//        list.add(43);
//        System.out.println(list);
//        list.contains(7);
        for(int i=0;i<5;i++){
            list.add(input.nextInt(i));
        }
        for(int i=0;i<5;i++){
            System.out.println(list.get(i));
        }
//        System.out.println(list);
    }
}
