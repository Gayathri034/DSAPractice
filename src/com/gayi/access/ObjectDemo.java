package com.gayi.access;

public class ObjectDemo {
    int num;
    public ObjectDemo(int num){
        this.num=num;
    }
    @Override
    public int hashCode(){
        return super.hashCode();
    }
    @Override
    public String toString(){
        return super.toString();
    }
    @Override
    public boolean equals(Object obj){
        return super.equals(obj);
    }

    public static void main(String[] args) {
        ObjectDemo obj2=new ObjectDemo(34);
        ObjectDemo obj1=new ObjectDemo(34);
        System.out.println(obj2.hashCode());
        System.out.println(obj1.hashCode());
        if(obj2==obj1){
            System.out.println("i love u");
        }
        if(obj2.equals(obj1)){
            System.out.println("i hate u");
        }
        System.out.println(obj2.getClass().getAnnotatedInterfaces());
    }

}
