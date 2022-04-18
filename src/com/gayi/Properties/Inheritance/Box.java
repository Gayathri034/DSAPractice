package com.gayi.Properties.Inheritance;

public class Box {
   private double length;
    double width;
    double height;


     Box() {
        this.length=-1;

        this.width=-1;
        this.height=-1;

    }
     Box( double side){
        this.length= side;
        this.width=side;
        this.height=side;
    }
//     <h, w> Box(double l;double w;double h){
//        this.length= l;
//        this.width=w;
//        th/is.height=h;
//    }
    Box(Box old){
         this.length=old.length;
         this.width=old.width;
         this.height= old.height;
    }

    public Box(double l, double w, double h) {
         this.length=l;
         this.width=w;
         this.height=h;
    }

    public Box(double side, double weight) {

    }

    public void information(){
        System.out.println("run the program");
    }

}
