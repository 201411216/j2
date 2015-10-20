package com.j2.practice.decorator;

public abstract class Phone{
  protected String description = "Unknown Phone";
  public String getDescription(){
    return description;
  }
  public abstract double cost();
}