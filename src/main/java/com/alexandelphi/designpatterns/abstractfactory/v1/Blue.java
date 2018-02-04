package com.alexandelphi.designpatterns.abstractfactory.v1;

public class Blue implements Color {

  @Override
  public void fill() {
    System.out.println("Inside " + this.getClass().getSimpleName() + "::fill() method.");
  }
}
