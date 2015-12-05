package com.j2.state.videoplayer;

public class StopState implements State{
  VideoPlayer videoPlayer;
  
  public StopState(VideoPlayer v){
    this.videoPlayer = v;
  }
  
  public void play(){
    System.out.println("Now playing");
    videoPlayer.setState(videoPlayer.playState);
  }
  public void displaySleep(){
    System.out.println("Now display sleeping");
    videoPlayer.setState(videoPlayer.displayOffState);
  }
  public void displayOn(){
    System.out.println("Display already on");
  }
  public void stop(){
    System.out.println("Already stopped");
  } 
}