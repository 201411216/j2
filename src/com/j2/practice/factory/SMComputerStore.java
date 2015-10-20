package com.j2.practice.factory;

public class SMComputerStore extends ComputerStore{
  public Computer assembleComputer(String type){
    Computer computer = null;
    ComponentFactory f = new SMComponentFactory();
    if(type.equals("quad")){
      computer = new QuadCoreComputer(f);
      computer.setName("SM Quad Core Computer");
      computer.assemble();
    }
    else if(type.equals("dual")){
      computer = new DualCoreComputer(f);
      computer.setName("SM Dual Core Computer");
      computer.assemble();
    }
    return computer;
  }
}
      