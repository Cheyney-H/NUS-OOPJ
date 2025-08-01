package shape;

public class Circle extends Shape {
  private int radius;

  public Circle(int radius, String color) {
    super(color);

    type = "Circle";
    this.radius = radius;
  }

  // implements the abstract method of parent's
  public double area() {
    return Math.PI * radius * radius;
  }
}
