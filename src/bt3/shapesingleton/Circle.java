package shapesingleton;

public class Circle extends Shape {
  private static Circle instance;
  protected Circle () {}
  public static Circle createInstance () {
    if (instance == null) {
      instance = new Circle();
    }
    return instance;
  }
  @Override
  public String draw () {
    return "draw circle with: " + getBrush() + ", " + getPaper() + ", " + getFrame();
  }
}