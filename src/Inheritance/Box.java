package  Inheritance;

public class Box {
       static double l;
       static double h;
       static double w;
       Box(){
           this.l=-1;
           this.w=-1;
           this.h=-1;
       }
//      cube
    Box(double side){
           this.l=side;
           this.w=side;
           this.h=side;
    }
    Box(double l,double w,double h){
           this.l=l;
           this.w=w;
           this.h=h;

    }
//    copyconstructor
    Box(Box Old){
           this.l=Old.l;
           this.w=Old.w;
           this.h=Old.h;

    }
    static void Information(){
           System.out.println("Running the box");

    }
}
