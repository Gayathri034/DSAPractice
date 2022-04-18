package com.gayi.Properties.Inheritance;

public class BoxPrice extends Boxweight {
    double cost;

public BoxPrice() {
    super();
    this.cost=-1;


}
public BoxPrice(double l,double w,double h,double cost){
    super(l,w,h);
    this.cost=cost;

}
public BoxPrice(double l,double w,double h,double weight,double cost){
    super(l,w,h,weight,cost);
    this.cost=cost;
}
public BoxPrice(double side,double weight,double cost){
    super(side,weight,cost);
    this.cost=cost;
}
    }

