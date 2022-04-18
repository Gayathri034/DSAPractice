package com.gayi.Abstractclass;
import com.gayi.Abstractclass.Son;
public class Son extends Parent {
    public Son(int age){
        super(age);
    }
    @Override
    void career(){
        System.out.println("i hate cooking");
    }
    @Override
    void partner(){
        System.out.println("i hate u");
    }
}
