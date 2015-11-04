package com.j2.command.undo;

public class RemoteLoader {
 
 public static void main(String[] args) {
  RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
 
  Light livingRoomLight = new Light("Living Room");
  Light bathRoomLight = new Light("Bath Room");

  LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
  LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
  LightOnCommand bathRoomLightOn = new LightOnCommand(bathRoomLight);
  LightOffCommand bathRoomLightOff = new LightOffCommand(bathRoomLight);

  remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
  remoteControl.setCommand(1, bathRoomLightOn, bathRoomLightOff);
 
  remoteControl.onButtonWasPushed(0);
  remoteControl.offButtonWasPushed(0);
  System.out.println(remoteControl);
  remoteControl.undoButtonWasPushed();
  remoteControl.offButtonWasPushed(1);
  remoteControl.onButtonWasPushed(1);
  System.out.println(remoteControl);
  remoteControl.undoButtonWasPushed();
 }
}