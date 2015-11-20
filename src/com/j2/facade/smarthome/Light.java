package com.j2.facade.smarthome;

public class Light{
  private String description;
  private int brightness;
  
  public Light(String description){
    this.description = description;
    brightness = 0;
  }
  public void on(){
    brightness = 100;
    System.out.println(description + " on");
  }
  public void off(){
    brightness = 0;
    System.out.println(description + " off");
  }
  public String toString(){
    return description;
  }
}