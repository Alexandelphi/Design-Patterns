package com.alexandelphi.designpatterns.abstractfactory.v1;

import com.alexandelphi.designpatterns.abstractfactory.v1.color.Color;
import com.alexandelphi.designpatterns.abstractfactory.v1.shape.Shape;

public abstract class AbstractFactory {

  abstract Color getColor(String color);

  abstract Shape getShape(String shape);
}
