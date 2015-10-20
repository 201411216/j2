package com.j2.practice.observer;

public class Main{
  public static void main(String args[]){
    Message message = new Message();
    MessageReciever1 reciever = new MessageReciever1(message);
    
    When now1 = new When(2015, 10, 19, 2, 13);
    message.makeMessage("jun", now1, "hi~");
     When now2 = new When(2015, 10, 19, 2, 32);
    message.makeMessage("duck", now2, "i love you");
  }
}