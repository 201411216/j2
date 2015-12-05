package com.j2.state.videoplayer;

public class PlayState implements State{
  VideoPlayer videoPlayer;
  
  public PlayState(VideoPlayer v){
    this.videoPlayer = v;
  }
  
  public void play(){
    System.out.println("Already playing");
  }
  public void displaySleep(){
    System.out.println("You can't off display");
  }
  public void displayOn(){
    System.out.println("Display already on");
  }
  public void stop(){
    System.out.println("You stop playing");
    videoPlayer.setState(videoPlayer.stopState);
  } 

}