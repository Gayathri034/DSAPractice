package com.gayi.access;

public class A {
    protected int num;
    String name;
    int[]arr;



    public A(int num, String name) {
        this.num=num;
        this.name=name;
    }

    public int getnum(){
        return num;
    }
    public void setnum(int num){
        this.num=num;
    }
}
