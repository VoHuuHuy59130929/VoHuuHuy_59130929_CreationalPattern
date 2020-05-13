package shapesingleton;

public class ShapeFactory {
  public Shape createShape (ShapeType shapeType) {
    switch (shapeType) {
      case Rectangle:
        return Rectangle.createInstance();
      case Triangle:
        return Triangle.createInstance();
      case Circle:
        return Circle.createInstance();
      default: return null;
    }
  }
}