package com.gayi.ObjectCloning;
//import java.lang.Cloneable
public class Human implements Cloneable {

    String name;
    int age;
    public Human(String name,int age){
        this.name=name;
        this.age=age;
    }
    public Human(Human other){
        this.name=other.name;
        this.age=other.age;
@Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}


