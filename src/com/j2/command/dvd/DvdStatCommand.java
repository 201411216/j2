package com.j2.command.dvd;

public class DvdStatCommand implements Command{
  private DvdBox dvdbox;
  public DvdStatCommand(DvdBox dvdbox){
    this.dvdbox = dvdbox;
  }
  public void execute(){
    dvdbox.showStat();
  }
  public void undo(){}
}