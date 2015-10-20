package com.j2.practice.decorator;

public class RedSoftCase extends Case{
  public RedSoftCase(Phone p){
    this.phone = p;
    color = "red";
    hardness = 2.3;
  }
  public String getDescription(){
    return phone.getDescription() + " + red case(" + hardness + ")";
  }
  public double cost(){
    return phone.cost() + 2.75;
  }
}