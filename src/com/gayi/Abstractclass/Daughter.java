package com.gayi.Abstractclass;
import com.gayi.Abstractclass.Parent;
public class  Daughter extends Parent {
    public Daughter(int age){
        super(age);


    }
    @Override
    void career(){
        System.out.println("i love cooking");
    }
    void partner(){
        System.out.println("i love u ");
    }

}
