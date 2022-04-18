package com.gayi.Introduction;
import java.util.Arrays;
public class Main {
    public static void main(String []args){
        Student[]student1=new Student[5];
        Student kunal;
        System.out.println(Arrays.toString(student1));
    }
    static class Student{
        int rollno;
        String name;
        Float marks;

        public void greeting() {
        }
    }

}
