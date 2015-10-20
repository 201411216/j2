package com.j2.practice.factory;

public class KMQuadCPU extends CPU{
  public KMQuadCPU(){
    core = 4;
  }
  public String toString(){
    return "KM x4 CPU 1.8GHz";
  }
}