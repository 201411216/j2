package com.j2.facade.smarthome;

public class Computer{
  private String description;
  private bool status;
  public Computer(String description){
    this.description = description;
    status = false;
  }
  public void on(){
    status = true;
    System.out.println(description + " on");
  }
  public void off(){
    status = false;
    System.out.println(description + " off");
  }
   public String toString(){
    return description;
  }
}