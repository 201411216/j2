package com.j2.practice.factory;

public class ComputerMarket{
  public static void main(String args[]){
    ComputerStore sm = new SMComputerStore();
    ComputerStore km = new KMComputerStore();
    
    Computer c1 = sm.orderComputer("quad");
    System.out.println("Ethan ordered a " + c1 + "\n");
    Computer c2 = km.orderComputer("dual");
    System.out.println("Jason ordered a " + c2 + "\n");
  }
}