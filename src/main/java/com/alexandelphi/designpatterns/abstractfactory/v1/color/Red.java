package com.alexandelphi.designpatterns.abstractfactory.v1.color;

public class Red implements Color {

  @Override
  public void fill() {
    System.out.println("Inside " + this.getClass().getSimpleName() + "::fill() method.");
  }
}
