package com.alexandelphi.designpatterns.strategy.v1;

public abstract class Animal {

  protected String name;
  protected String sound;
  protected ClimbingTree climbingTreeType;

  public void setName(String newName) {
    this.name = newName;
  }

  public void setSound(String newSound) {
    this.sound = newSound;
  }

  public String getName() {
    return name;
  }

  public String getSound() {
    return sound;
  }

  public void setClimbingTreeAbility(ClimbingTree newClimbingTreeType) {
    this.climbingTreeType = newClimbingTreeType;
  }

  public String tryToClimbTree() {
    return climbingTreeType.climbTree();
  }

}
