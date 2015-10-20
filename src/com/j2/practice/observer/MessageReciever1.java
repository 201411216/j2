package com.j2.practice.observer;

import java.util.ArrayList;

public class MessageReciever1 implements Observer, DisplayElement{
  private ArrayList whoList;
  private ArrayList whenList;
  private ArrayList messageList;
  
  public MessageReciever1(Subject s){
    whoList = new ArrayList();
    whenList = new ArrayList();
    messageList = new ArrayList();
    s.registerObserver(this);
  }
  public void update(String who, When when, String message){
    whoList.add(who);
    whenList.add(when);
    messageList.add(message);
    display();
  }
  public void display(){
    System.out.println(this + " -> Caller : " + whoList.get(whoList.size()-1) + " / Time : " + whenList.get(whenList.size()-1)
                         + " / Message : " + messageList.get(messageList.size()-1));
  }
  public void listDisplay(){
    for(int i = 0; i < whoList.size(); i++){
      System.out.println(this + " -> Caller : " + whoList.get(i) + " / Time : " + whenList.get(i)
                         + " / Message : " + messageList.get(i));
    }
  }
  public String toString(){
    return "Reciever 1";
  }
}