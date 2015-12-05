package com.j2.state.gumball.error;

public class ErrorState implements State {
    GumballMachine gumballMachine;
 
    public ErrorState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
 public void insertQuarter() {
  System.out.println("Error!");
 }
 
 public void ejectQuarter() {
  System.out.println("Error!");
 }
 
 public void turnCrank() {
  System.out.println("Error!");
  }
 
 public void dispense() {
  System.out.println("Error!");
 } 
 
 public String toString() {
  return "Error!";
 }
}
