package com.alexandelphi.designpatterns.abstractfactory.v1;

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
