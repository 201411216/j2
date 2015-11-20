package com.j2.templatemethod.caramel;

import java.io.*;

public class CaramelMacchiatoWithHook extends CoffeeWithHook {
 
 public void brew() {
  System.out.println("Dripping Coffee through filter");
 }
 
 public void addCondiments() {
  System.out.println("Adding Sugar and Milk");
 }
 
 public void addEssence(){
  System.out.println("Adding vanilla syrup, caramel, milk");
 }
 
 public boolean customerWantsCondiments() {
  String answer = getUserInput();
  if (answer.toLowerCase().startsWith("y")) {
   return true;
  } else {
   return false;
  }
 }
 private String getUserInput() {
  String answer = null;
  System.out.print("Would you like milk and sugar with your coffee (y/n)? ");
  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
  try {
   answer = in.readLine();
  } catch (IOException ioe) {
   System.err.println("IO error trying to read your answer");
  }
  if (answer == null) {
   return "no";
  }
  return answer;
 }
}
