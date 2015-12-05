package com.j2.state.videoplayer;

public class DisplayOffState implements State{
  VideoPlayer videoPlayer;
  
  public DisplayOffState(VideoPlayer v){
    this.videoPlayer = v;
  }
  
  public void play(){
    System.out.println("Stop video");
  }
  public void displaySleep(){
    System.out.println("Already sleeped");
  }
  public void displayOn(){
    System.out.println("Display on");
    videoPlayer.setState(videoPlayer.stopState);
  }
  public void stop(){
    System.out.println("You can't stop playing");
  } 
  
  
}