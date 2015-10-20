package com.j2.practice.factory;

public abstract class Computer{
  protected String name;
  protected CPU cpu;
  protected GraphicCard graphicCard;
  protected RAM ram;
  protected HDD hdd;
  protected ComponentFactory componentFactory;
  
  public String toString(){
    return "PC name:" + name + ", CPU:" + cpu + ", GraphicCard:" + graphicCard + ", RAM:" + ram + ", HDD:" + hdd;
  }
  abstract void assemble();
  void setName(String name){
    this.name = name;
  }
}