package com.j2.practice.factory;

public class KMComputerStore extends ComputerStore{
  public Computer assembleComputer(String type){
    Computer computer = null;
    ComponentFactory f = new KMComponentFactory();
    if(type.equals("quad")){
      computer = new QuadCoreComputer(f);
      computer.setName("KM Quad Core Computer");
      computer.assemble();
    }
    else if(type.equals("dual")){
      computer = new DualCoreComputer(f);
      computer.setName("KM Dual Core Computer");
      computer.assemble();
    }
    return computer;
  }
}