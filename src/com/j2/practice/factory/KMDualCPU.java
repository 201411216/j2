package com.j2.practice.factory;

public class KMDualCPU extends CPU{
  public KMDualCPU(){
    core = 2;
  }
  public String toString(){
    return "KM x2 CPU 1.9GHz";
  }
}