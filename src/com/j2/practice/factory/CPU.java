package com.j2.practice.factory;

public abstract class CPU implements Component{
  protected int core;
  public int getCore(){
    return core;
  }
}