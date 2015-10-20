package com.j2.practice.decorator;

public class PinkHardCase extends Case{
  public PinkHardCase(Phone p){
    this.phone = p;
    color = "pink";
    hardness = 5.5;
  }
  public String getDescription(){
    return phone.getDescription() + " + pink case(" + hardness + ")";
  }
  public double cost(){
    return phone.cost() + 3.85;
  }
}