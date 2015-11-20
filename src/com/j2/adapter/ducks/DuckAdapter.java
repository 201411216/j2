package com.j2.adapter.ducks;

public class DuckAdapter implements Turkey{
  protected Duck duck;
  public DuckAdapter(Duck duck){
    this.duck = duck;
  }
  public void gobble(){
    this.duck.quack();
  }
  public void fly(){
    for(int i = 0; i < 5; i++){
      this.duck.fly();
    }
  }
}