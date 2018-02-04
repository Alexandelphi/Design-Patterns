package com.alexandelphi.designpatterns.abstractfactory.v1;

import com.alexandelphi.designpatterns.abstractfactory.v1.color.Blue;
import com.alexandelphi.designpatterns.abstractfactory.v1.color.Color;
import com.alexandelphi.designpatterns.abstractfactory.v1.color.Green;
import com.alexandelphi.designpatterns.abstractfactory.v1.color.Red;
import com.alexandelphi.designpatterns.abstractfactory.v1.shape.Shape;

public class ColorFactory extends AbstractFactory {

  @Override
  Color getColor(String color) {
    if (color == null) {
      return null;
    }
    if (color.equalsIgnoreCase("RED")) {
      return new Red();
    }
    if (color.equalsIgnoreCase("GREEN")) {
      return new Green();
    }
    if (color.equalsIgnoreCase("BLUE")) {
      return new Blue();
    }
    return null;
  }

  @Override
  Shape getShape(String shapeType) {
    return null;
  }
}
