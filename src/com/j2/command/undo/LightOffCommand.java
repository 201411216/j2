package com.j2.command.undo;

public class LightOffCommand implements Command{
  protected Light light;
  protected int level;
  public LightOffCommand(Light light){
    this.light = light;
  }
  public void execute(){
    level = light.getLevel();
    light.off();
  }
  public void undo(){
    light.dim(level);
  }
}