package com.alexandelphi.designpatterns.abstractfactory.v1;

import com.alexandelphi.designpatterns.abstractfactory.v1.color.Color;
import com.alexandelphi.designpatterns.abstractfactory.v1.shape.Circle;
import com.alexandelphi.designpatterns.abstractfactory.v1.shape.Rectangle;
import com.alexandelphi.designpatterns.abstractfactory.v1.shape.Shape;
import com.alexandelphi.designpatterns.abstractfactory.v1.shape.Square;

public class ShapeFactory extends AbstractFactory {

  @Override
  Color getColor(String color) {
    return null;
  }

  @Override
  Shape getShape(String shapeType) {
    if (shapeType == null) {
      return null;
    }
    if (shapeType.equalsIgnoreCase("CIRCLE")) {
      return new Circle();
    }
    if (shapeType.equalsIgnoreCase("RECTANGLE")) {
      return new Rectangle();
    }
    if (shapeType.equalsIgnoreCase("SQUARE")) {
      return new Square();
    }
    return null;
  }
}
