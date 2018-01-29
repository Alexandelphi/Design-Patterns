package com.alexandelphi.designpatterns.strategy.v2;

public class OperationAdd implements Strategy {

  @Override
  public int doOperation(int num1, int num2) {
    return num1 + num2;
  }
}
