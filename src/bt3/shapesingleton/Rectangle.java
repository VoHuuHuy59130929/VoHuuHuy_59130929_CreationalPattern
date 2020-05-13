package shapesingleton;

public class Rectangle extends Shape {
  private static Rectangle instance;
  protected Rectangle () {}
  public static Rectangle createInstance () {
    if (instance == null) {
      instance = new Rectangle();
    }
    return instance;
  }
  @Override
  public String draw () {
    return "draw rectangle with: " + getBrush() + ", " + getPaper() + ", " + getFrame();
  }
}