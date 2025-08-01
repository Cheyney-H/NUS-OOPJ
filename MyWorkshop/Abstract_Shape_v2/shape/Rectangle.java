package shape;

public class Rectangle extends Shape {
  private int width;
  private int height;

  public Rectangle(int width, int height, String color) {
    super(color);

    type = "Rectangle";

    this.width = width;
    this.height = height;
  }

  // implements the abstract method of parent's
  public double area() {
    return width * height;
  }
}
