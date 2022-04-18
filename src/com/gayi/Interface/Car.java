package com.gayi.Interface;

public class Car implements Engine,Brake{
    @Override
    public void Brake(){
        System.out.println("i hate u bhavani");
    }
    @Override
    public void start(){

        System.out.println("i love u");

    }
    @Override
    public void stop(){
        System.out.println(" i want to marry u");
    }
    @Override
    public void acc(){
        System.out.println("please forgive me");
    }
}
