package main;

import mystringbuilder.*;

public class Main {
  public static void main(String[] args) {
    MyStringBuilder myStringBuider = new MyStringBuilder.Builder()
      .addString("String ")
      .addFloat(123)
      .addString(" ")
      .addBoolean(true)
      .build();
    System.out.println(myStringBuider.toString());
  }
}