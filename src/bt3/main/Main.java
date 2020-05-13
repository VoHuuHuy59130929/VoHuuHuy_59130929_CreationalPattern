package main;

import shapesingleton.*;
import shapesingleton.ShapeType;

public class Main {
  public static void main(String[] args) {
    System.out.println("----- Circle -----");
    Shape circle = new ShapeFactory().createShape(ShapeType.Circle);
    circle.setPaper("A4");
    circle.setBrush("pencil");
    System.out.println("Circle 0: " + circle.draw());
    Shape circle1 = new ShapeFactory().createShape(ShapeType.Circle);
    circle1.setFrame("wood");
    System.out.println("Circle 1: " + circle1.draw());
    System.out.println("Circle 0: " + circle.draw());

    System.out.println("----- Triangle -----");
    Shape triangle = new ShapeFactory().createShape(ShapeType.Triangle);
    triangle.setPaper("A0");
    triangle.setBrush("paint");
    System.out.println("Triangle 0: " + triangle.draw());
    Shape triangle1 = new ShapeFactory().createShape(ShapeType.Triangle);
    triangle1.setFrame("Iron");
    System.out.println("Triangle 1: " + triangle1.draw());
    System.out.println("Triangle 0: " + triangle.draw());

    System.out.println("----- Rectangle -----");
    Shape rectangle = new ShapeFactory().createShape(ShapeType.Rectangle);
    rectangle.setPaper("A2");
    rectangle.setBrush("ballpoint pens");
    System.out.println("Rectangle 0: " + rectangle.draw());
    Shape rectangle1 = new ShapeFactory().createShape(ShapeType.Rectangle);
    rectangle1.setFrame("not frame");
    System.out.println("Rectangle 1: " + rectangle1.draw());
    System.out.println("Rectangle 0: " + rectangle.draw());
  }
}