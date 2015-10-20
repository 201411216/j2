package com.j2.practice.factory;

public class KMComponentFactory implements ComponentFactory{
  public CPU createQuadCPU(){
    return new KMQuadCPU();
  }
  public CPU createDualCPU(){
    return new KMDualCPU();
  }
  public GraphicCard createGRP(){
    return new KMGraphicCard();
  }
  public RAM createRAM(){
    return new KMRAM();
  }
  public HDD createHDD(){
    return new KMHDD();
  }
}