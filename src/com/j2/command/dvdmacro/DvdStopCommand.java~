package com.j2.command.dvd;

public class DvdStopCommand implements Command{
  private DvdBox dvdbox;
  private Status lastStat;
  public DvdStopCommand(DvdBox dvdbox){
    this.dvdbox = dvdbox;
  }
  public void execute(){
    lastStat = dvdbox.getStat();
    dvdbox.stop();
  }
  public void undo(){
    if(this.lastStat == Status.PLAYING){
      dvdbox.play();
    }
    else if(this.lastStat == Status.STOPPED){
      dvdbox.stop();
    }
    else if(this.lastStat == Status.PAUSED){
      dvdbox.pause();
    }
    else{
      System.out.println("Status Error");
    }
  }
}