package com.j2.templatemethod.caramel;

public class CaramelMacchiato extends Coffee {
 public void brew() {
  System.out.println("Dripping Coffee through filter");
 }
 public void addCondiments() {
  System.out.println("Adding vanilla syrup, caramel, milk");
 }
}
