package com.alexandelphi.designpatterns.strategy.v1;

public class Dog extends Animal {

  public Dog(){
    setSound("Arf-arf. Woof-woof.");
    setClimbingTreeAbility(new CantClimb());
  }

  public void digHole(){
    System.out.println("Dug a hole.");
  }

}
