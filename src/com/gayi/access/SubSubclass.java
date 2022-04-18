package com.gayi.access;
import com.gayi.access.A;
public class SubSubclass extends A{
    public SubSubclass(int num,String name){
        super(num,name);
    }

    public static void main(String[] args) {
       SubSubclass obj=new SubSubclass(34,"gayi");
       int num=obj.num;
        System.out.println(obj instanceof A);
    }



}
