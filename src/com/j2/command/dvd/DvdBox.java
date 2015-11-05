package com.j2.command.dvd;

public class DvdBox{
  protected String location;
  protected String[] dvds;
  protected int nowPlay;
  protected Status status;
  
  public DvdBox(String location){
    this.location = location;
    nowPlay = 0;
    this.dvds = new String[3];
    this.status = Status.STOPPED;
  }
  
  public void insertDvd(int index, String dvd0){
    if(index >= 0 && index < 3){
      dvds[index] = dvd0;
      System.out.println(location + " : " + index + ", " + dvd0);
    }
    else{
      System.out.println("Wrong Index Error!");
    }
  }
  
  public void playNext(){
    nowPlay = (nowPlay+1)%3;
  }
  public void playIndex(int index){
    if(index >= 0 && index < 3){
      nowPlay = index;
    }
    else{
      System.out.println("Wrong Index Error!");
    }
  }
  public void play(){
    this.status = Status.PLAYING;
    showStat();
  }
  
  public void pause(){
    this.status = Status.PAUSED;
    showStat();
  }
  
  public void stop(){
    this.status = Status.STOPPED;
    showStat();
  }
  
  public String getStatStr(){
    if(this.status == Status.PLAYING){
      return "playing";
    }
    else if(this.status == Status.STOPPED){
      return "stopped";
    }
    else if(this.status == Status.PAUSED){
      return "paused";
    }
    else{
      return "Status Error";
    }
  }
  
  public void showStat(){
    System.out.println("Dvd is " + getStatStr() +", Track " + getPlay());
  }
  
  public Status getStat(){
    return status;
  }
  
  public int getPlay(){
    return nowPlay;
  }
}