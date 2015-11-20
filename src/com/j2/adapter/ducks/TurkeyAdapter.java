package com.j2.adapter.ducks;

public class TurkeyAdapter implements Duck{
  protected Turkey turkey;
  public TurkeyAdapter(Turkey turkey){
    this.turkey = turkey;
  }
  public void quack(){
    this.turkey.gobble();
  }
  public void fly(){
    for(int i = 0; i < 5; i++){
      this.turkey.fly();
    }
  }
}