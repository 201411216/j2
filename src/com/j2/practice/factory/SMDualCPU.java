package com.j2.practice.factory;

public class SMDualCPU extends CPU{
  public SMDualCPU(){
    core = 2;
  }
  public String toString(){
    return "SM x2 CPU 2.3GHz";
  }
}