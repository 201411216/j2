package com.j2.state.videoplayer;

class VideoPlayer{
 public State displayOffState;  
 public State stopState; 
 public State playState; 
 public State state;
 
 public VideoPlayer(){
   displayOffState = new DisplayOffState(this);
   stopState = new StopState(this);
   playState = new PlayState(this);
   state = stopState;
 }
 
 public void setState(State s){
    this.state = s;
  }
 public void play(){
   state.play();
 }
 public void displaySleep(){
   state.displaySleep();
 }
 public void displayOn(){
   state.displayOn();
 }
 public void stop(){
   state.stop();
 }
}