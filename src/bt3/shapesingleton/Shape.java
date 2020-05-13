package shapesingleton;

public abstract class Shape {
  private String brush, paper, frame;
  public void setBrush (String brush) { this.brush = brush; }
  public void setPaper (String paper) { this.paper = paper; }
  public void setFrame (String frame) { this.frame = frame; }
  public String getBrush () { return this.brush; }
  public String getPaper () { return this.paper; }
  public String getFrame () { return this.frame; }
  public abstract String draw ();
}