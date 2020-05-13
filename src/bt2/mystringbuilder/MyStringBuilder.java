package mystringbuilder;

import java.util.ArrayList;

public class MyStringBuilder {
  private String str;
  protected MyStringBuilder(Builder builder) {
    setStr(builder.str);
  }
  public void setStr (String str) {
    this.str = str;
  }
  @Override
  public String toString () {
    return this.str;
  }
  public static class Builder {
    public String str;
    public Builder addString (String s) {
      if (this.str != null) {
        this.str += s;
      } else {
        this.str = s;
      }
      return this;
    }
    public Builder addFloat (float f) {
      if (this.str != null) {
        this.str += String.format("%.2f", f);
      } else {
        this.str = String.format("%.2f", f);
      }
      return this;
    }
    public Builder addBoolean (boolean b) {
      if (this.str != null) {
        this.str += b;
      } else {
        this.str = "" + b;
      }
      return this;
    }
    public MyStringBuilder build () {
      return new MyStringBuilder(this);
    }
  }
}