package com.alexandelphi.designpatterns.strategy.v1;

public interface ClimbingTree {

  String climbTree();
}

class CanClimb implements ClimbingTree {

  public String climbTree() {
    return "I can climb a tree.";
  }
}

class CantClimb implements ClimbingTree {

  public String climbTree() {
    return "Can't climb a tree.";
  }
}
