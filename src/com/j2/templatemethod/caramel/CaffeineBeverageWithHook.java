package com.j2.templatemethod.caramel;

public abstract class CaffeineBeverageWithHook {
 void prepareRecipe() {
  boilWater();
  brew();
  pourInCup();
  addEssence();
  if (customerWantsCondiments()) {
   addCondiments();
  }
 }
 abstract void brew();
 abstract void addCondiments();
 abstract void addEssence();
 void boilWater() {
  System.out.println("Boiling water");
 }
 void pourInCup() {
  System.out.println("Pouring into cup");
 }
 boolean customerWantsCondiments() {
  return true;
 }
}