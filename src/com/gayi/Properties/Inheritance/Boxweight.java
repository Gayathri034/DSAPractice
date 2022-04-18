package com.gayi.Properties.Inheritance;

public class Boxweight extends Box {
    double weight;
    public Boxweight(){
        this.weight=-1;
    }
    public Boxweight(double l,double w,double h,double weight){
        super(l,w,h);
        this.weight= weight;
    }
    public Boxweight(double side,double weight){
        super(side,weight);
        this.weight=weight;
    }

    public Boxweight(double l, double w, double h, double weight, double cost) {
    }

    public Boxweight(double side, double weight, double cost) {
    }
}
