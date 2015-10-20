package com.j2.practice.factory;

public class SMComponentFactory implements ComponentFactory{
  public CPU createQuadCPU(){
    return new SMQuadCPU();
  }
  public CPU createDualCPU(){
    return new SMDualCPU();
  }
  public GraphicCard createGRP(){
    return new SMGraphicCard();
  }
  public RAM createRAM(){
    return new SMRAM();
  }
  public HDD createHDD(){
    return new SMHDD();
  }
}