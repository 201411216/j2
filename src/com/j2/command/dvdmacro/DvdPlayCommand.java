package com.j2.command.dvdmacro;

public class DvdPlayCommand implements Command{
  private DvdBox dvdbox;
  private Status lastStat;
  public DvdPlayCommand(DvdBox dvdbox){
    this.dvdbox = dvdbox;
  }
  public void execute(){
    lastStat = dvdbox.getStat();
    dvdbox.play();
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