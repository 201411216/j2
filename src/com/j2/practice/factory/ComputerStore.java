package com.j2.practice.factory;

public abstract class ComputerStore{
  public Computer orderComputer(String type){
    Computer computer = assembleComputer(type);
    return computer;
  }
  protected abstract Computer assembleComputer(String type);
}