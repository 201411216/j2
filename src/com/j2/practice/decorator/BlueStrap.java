package com.j2.practice.decorator;

public class BlueStrap extends Strap{
  public BlueStrap(Phone p){
    color = "blue";
    this.phone = p;
  }
  public String getDescription(){
    return phone.getDescription() + " + blue strap";
  }
  public double cost(){
    return phone.cost() + 1.50;
  }
}