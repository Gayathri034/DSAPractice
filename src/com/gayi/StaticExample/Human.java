package com.gayi.StaticExample;

public class Human{
    //    public static void main(String[] args)  {
            int rollno;
            String name;
            Float salary;
            Boolean Married;
           static  Long population;

            public Human(int rollno,String name, Float salary,Boolean Married ){
                this.rollno= rollno;
                this.name= name;
                this.salary=salary;
                this.Married=Married;
                Human.population+=1;

//        }
    }
}
