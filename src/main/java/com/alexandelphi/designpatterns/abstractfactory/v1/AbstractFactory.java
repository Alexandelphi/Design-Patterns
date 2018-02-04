package com.alexandelphi.designpatterns.abstractfactory.v1;

public abstract class AbstractFactory {

  abstract Color getColor(String color);

  abstract Shape getShape(String shape);
}
