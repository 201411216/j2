package com.j2.command.dvdmacro;

import java.util.*;

public class RemoteControlWithUndo{
  Command[] playCommands;
  Command[] pauseCommands;
  Command[] stopCommands;
  Command[] nextCommands;
  Command[] statCommands;
  Command undoCommand;
  
  public RemoteControlWithUndo(){
    playCommands = new Command[2];
    pauseCommands = new Command[2];
    stopCommands = new Command[2];
    nextCommands = new Command[2];
    statCommands = new Command[2];
    
    Command noCommand = new NoCommand();
    for(int i = 0; i < 2; i++){
      playCommands[i] = noCommand;
      pauseCommands[i] = noCommand;
      stopCommands[i] = noCommand;
      nextCommands[i] = noCommand;
      statCommands[i] = noCommand;
    }
    undoCommand = noCommand;
  }
  public void setCommand(int slot, Command playCommand, Command pauseCommand, Command stopCommand, Command nextCommand, Command statCommand){
    if(slot >= 0 && slot < 2){
      playCommands[slot] = playCommand;
      pauseCommands[slot] = pauseCommand;
      stopCommands[slot] = stopCommand;
      nextCommands[slot] = nextCommand;
      statCommands[slot] = statCommand;
    }
  }
  public void playButtonWasPushed(int slot){
    if(slot >= 0 && slot < 2){
      playCommands[slot].execute();
      undoCommand = playCommands[slot];
    }
  }
  public void pauseButtonWasPushed(int slot){
    if(slot >= 0 && slot < 2){
      pauseCommands[slot].execute();
      undoCommand = pauseCommands[slot];
    }
  }
  public void stopButtonWasPushed(int slot){
    if(slot >= 0 && slot < 2){
      stopCommands[slot].execute();
      undoCommand = stopCommands[slot];
    }
  }
  public void nextButtonWasPushed(int slot){
    if(slot >= 0 && slot < 2){
      nextCommands[slot].execute();
      undoCommand = nextCommands[slot];
    }
  }
  public void statButtonWasPushed(int slot){
    if(slot >= 0 && slot < 2){
      statCommands[slot].execute();
    }
  }
  public void undoButtonWasPushed(){
    undoCommand.undo();
  }
  public String toString() {
    StringBuffer stringBuff = new StringBuffer();
    stringBuff.append("\n------ Remote Control -------\n");
    for (int i = 0; i < playCommands.length; i++) {
      stringBuff.append("[slot " + i + "]\n    " + playCommands[i].getClass().getName()
                          + "\n    " + pauseCommands[i].getClass().getName() 
                          + "\n    " + stopCommands[i].getClass().getName()
                          + "\n    " + nextCommands[i].getClass().getName()
                          + "\n    " + statCommands[i].getClass().getName()
                          + "\n");
    }
    stringBuff.append("[undo] " + undoCommand.getClass().getName() + "\n");
    return stringBuff.toString();
  }
}