package com.j2.practice.factory;

public class QuadCoreComputer extends Computer{
  public QuadCoreComputer(ComponentFactory f){
    name = "";
    cpu = null;
    graphicCard = null;
    ram = null;
    hdd = null;
    this.componentFactory = f;
  }
  
  public void assemble(){
    System.out.println("Assembling " + name + "...");
    cpu = componentFactory.createQuadCPU();
    graphicCard = componentFactory.createGRP();
    ram = componentFactory.createRAM();
    hdd = componentFactory.createHDD();
  }
}