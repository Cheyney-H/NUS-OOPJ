package shape;

public class Triangle extends Shape {
  private int base;
  private int height;

  public Triangle(int base, int height, String color) {
    super(color);

    type = "Triangle";

    this.base = base;
    this.height = height;
  }

  // implements the abstract method of parent's
  public double area() {
    return 0.5*base * height;
  }
}
