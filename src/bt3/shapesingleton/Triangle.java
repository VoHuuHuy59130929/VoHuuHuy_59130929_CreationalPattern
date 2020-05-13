package shapesingleton;

public class Triangle extends Shape {
  private static Triangle instance;
  protected Triangle () {}
  public static Triangle createInstance () {
    if (instance == null) {
      instance = new Triangle();
    }
    return instance;
  }
  @Override
  public String draw () {
    return "draw triangle with: " + getBrush() + ", " + getPaper() + ", " + getFrame();
  }
}