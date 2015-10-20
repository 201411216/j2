package com.j2.practice.factory;

public class DualCoreComputer extends Computer{
  public DualCoreComputer(ComponentFactory f){
    name = "";
    cpu = null;
    graphicCard = null;
    ram = null;
    hdd = null;
    this.componentFactory = f;
  }
  
  public void assemble(){
    System.out.println("Assembling " + name + "...");
    cpu = componentFactory.createDualCPU();
    graphicCard = componentFactory.createGRP();
    ram = componentFactory.createRAM();
    hdd = componentFactory.createHDD();
  }
}