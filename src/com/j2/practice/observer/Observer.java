package com.j2.practice.observer;

public interface Observer{
  public void update(String who, When when, String message);
}