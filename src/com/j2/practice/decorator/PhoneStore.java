package com.j2.practice.decorator;

public class PhoneStore{
  public static void main(String args[]){
    Phone phone01 = new GalaxyS6();
    phone01 = new PinkHardCase(phone01);
    phone01 = new BlueStrap(phone01);
    System.out.println(phone01.getDescription() + " $" + phone01.cost());
    
    Phone phone02 = new V10();
    phone02 = new RedSoftCase(phone02);
    phone02 = new BlueStrap(phone02);
    System.out.println(phone02.getDescription() + " $" + phone02.cost());
  }
}