package com.j2.command.dvd;

public class MacroCommand implements Command{
  protected Command[] commands;
  public MacroCommand(Command[] commands){
    this.commands = new Command[commands.length];
    for(int i = 0; i < commands.length; i++){
      this.commands[i] = commands[i];
    }
  }
  public void execute(){
    for(int i = 0; i < this.commands.length; i++){
      this.commands[i].execute();
    }
  }
  public void undo(){
    for(int i = 0; i < this.commands.length; i++){
      this.commands[i].undo();
    }
  }
}