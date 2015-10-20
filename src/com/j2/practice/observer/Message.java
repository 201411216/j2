package com.j2.practice.observer;

import java.util.ArrayList;

public class Message implements Subject{
  private ArrayList observers;
  private String who;
  private When when;
  private String message;
  
  public Message(){
    observers = new ArrayList();
  }
  public void registerObserver(Observer o){
    observers.add(o);
  }
  public void removeObserver(Observer o){
    int i = observers.indexOf(o);
    if(i >= 0){
      observers.remove(i);
    }
  }
  public void notifyObserver(){
    for(int i = 0; i < observers.size(); i++){
      Observer o = (Observer)observers.get(i);
      o.update(who, when, message);
    }
  }
  public void makeMessage(String who, When when, String message){
    this.who = who;
    this.when = when;
    this.message = message;
    notifyObserver();
  }
  public String getWho(){
    return who;
  }
  public When getWhen(){
    return when;
  }
  public String getMessage(){
    return message;
  }
}