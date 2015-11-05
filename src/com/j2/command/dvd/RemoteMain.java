package com.j2.command.dvd;

public class RemoteMain{
  public static void main(String[] args){
    DvdBox livingRoomDvdBox = new DvdBox("Living room DVD Player");
    livingRoomDvdBox.insertDvd(0, "Love Actually");
    livingRoomDvdBox.insertDvd(1, "Monster");
    livingRoomDvdBox.insertDvd(2, "D-War");
    
    DvdBox bedRoomDvdBox = new DvdBox("Bed room DVD Player");
    bedRoomDvdBox.insertDvd(0, "Iron Man");
    bedRoomDvdBox.insertDvd(1, "Bat Man");
    bedRoomDvdBox.insertDvd(2, "X-Man");
    
    DvdPlayCommand livingRoomDvdPlay = new DvdPlayCommand(livingRoomDvdBox);
    DvdPauseCommand livingRoomDvdPause = new DvdPauseCommand(livingRoomDvdBox);
    DvdStopCommand livingRoomDvdStop = new DvdStopCommand(livingRoomDvdBox);
    DvdPlayCommand bedRoomDvdPlay = new DvdPlayCommand(bedRoomDvdBox);
    DvdPauseCommand bedRoomDvdPause = new DvdPauseCommand(bedRoomDvdBox);
    DvdStopCommand bedRoomDvdStop = new DvdStopCommand(bedRoomDvdBox);
    DvdInsertNextCommand livingRoomDvdNext = new DvdInsertNextCommand(livingRoomDvdBox);
    DvdInsertNextCommand bedRoomDvdNext = new DvdInsertNextCommand(bedRoomDvdBox);
    DvdStatCommand livingRoomDvdStat = new DvdStatCommand(livingRoomDvdBox);
    DvdStatCommand bedRoomDvdStat = new DvdStatCommand(bedRoomDvdBox);
    
    RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
    remoteControl.setCommand(0, livingRoomDvdPlay, livingRoomDvdPause, livingRoomDvdStop, livingRoomDvdNext, livingRoomDvdStat);
    remoteControl.setCommand(1, bedRoomDvdPlay, bedRoomDvdPause, bedRoomDvdStop, bedRoomDvdNext, bedRoomDvdStat);
    
    System.out.println(remoteControl);
    remoteControl.playButtonWasPushed(0);
    remoteControl.playButtonWasPushed(1);
    remoteControl.pauseButtonWasPushed(1);
    remoteControl.statButtonWasPushed(0);
    System.out.println("\n");
    remoteControl.nextButtonWasPushed(1);
    remoteControl.nextButtonWasPushed(1);
    remoteControl.nextButtonWasPushed(0);
    remoteControl.stopButtonWasPushed(0);
    remoteControl.statButtonWasPushed(0);
    System.out.println(remoteControl);
  }
}
    
    
    