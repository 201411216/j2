package com.j2.practice.factory;

public interface ComponentFactory{
  public CPU createQuadCPU();
  public CPU createDualCPU();
  public GraphicCard createGRP();
  public RAM createRAM();
  public HDD createHDD();
}