package shape;

public abstract class Shape {
  protected String type;
  protected String color;

  public Shape(String color) {
    this.color = color;
  }

  public String getColor() { 
    return color;
  }

  public String getType() { 
    return type;
  }

  // abstract method (for child to implement)
  public abstract double area();
}




