package com.alexandelphi.designpatterns.abstractfactory.v1.shape;

public class Circle implements Shape {

  @Override
  public void draw() {
    System.out.println("Inside " + this.getClass().getSimpleName() + "::draw() method.");
  }
}
