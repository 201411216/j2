package com.j2.state.videoplayer;

public class VideoPlayerTestDrive { 
 public static void main(String[] args) { 
  VideoPlayer videoPlayer= new VideoPlayer(); 

  videoPlayer.play(); 
  videoPlayer.stop(); 
  videoPlayer.displaySleep();
  videoPlayer.play(); 
  videoPlayer.displayOn();  
  videoPlayer.play(); 
  videoPlayer.displaySleep();
 } 
} 
