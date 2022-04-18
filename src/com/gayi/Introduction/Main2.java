package com.gayi.Introduction;

public class Main2 {
//    private final int rollno;
//    private Object Kushwaha;
//    private Object name;
//    private int marks;
//    private Object Kunal;

    public static void main(String[] args) {
        Student kunal=new Student(27,"kunal kushwaha",54f);

        
//main obj=new main();
//obj.greeting;

        System.out.println(kunal.rollno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);
    }
     static class Student {
         int rollno;
         String name;
         float marks;


          Student() {
             this.rollno = 23;
             this.name = "Kunal Kushwaha";
             this.marks = 56;
         }
         Student(int rollno,String name,Float marks){
             this.rollno=rollno;
             this.name=name;
             this.marks=marks;
         }
     }
}
