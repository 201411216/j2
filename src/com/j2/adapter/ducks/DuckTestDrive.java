package com.j2.adapter.ducks;

public class DuckTestDrive{
  public static void main(String[] args){
    MallardDuck duck = new MallardDuck();
    WildTurkey turkey = new WildTurkey();
    Duck turkeyAdapter = new TurkeyAdapter(turkey);
    System.out.println("Turkey says...");
    turkey.gobble();
    turkey.fly();
    System.out.println("Turkey adapter says...");
    turkeyAdapter.quack();
    turkeyAdapter.fly();
    Turkey duckAdapter = new DuckAdapter(duck);
    System.out.println("Duck says...");
    duck.quack();
    duck.fly();
    System.out.println("Duck adapter says...");
    duckAdapter.gobble();
    duckAdapter.fly();
  }
}