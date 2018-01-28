package com.alexandelphi.designpatterns.strategy.v1;

public class Cat extends Animal {

  public Cat(){
    setSound("Mur-mur");
    setClimbingTreeAbility(new CanClimb());
  }

  public void catchMouse(){
    System.out.println("Caught a mouse.");
  }

}
