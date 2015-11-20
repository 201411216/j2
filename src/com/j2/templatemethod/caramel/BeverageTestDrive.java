package com.j2.templatemethod.caramel;

public class BeverageTestDrive {
 public static void main(String[] args) {
 
  Coffee coffee = new CaramelMacchiato();
 
  System.out.println("\nMaking caramel macchiato...");
  coffee.prepareRecipe();
  
  CoffeeWithHook coffeeHook = new CaramelMacchiatoWithHook();
  System.out.println("\nMaking caramel macchiato...");
  coffeeHook.prepareRecipe();
 }
}
