package com.j2.practice.observer;

public interface Subject{
  public void notifyObserver();
  public void registerObserver(Observer o);
  public void removeObserver(Observer o);
}