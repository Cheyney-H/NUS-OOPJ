package main;

import shape.Shape;
import shape.Circle;
import shape.Rectangle;
import shape.Triangle;

public class Program {
  public static void main(String[] args) {
    Shape circle = new Circle(5, "orange");
    System.out.printf("Area of %s %s = %.2f\n",
            circle.getColor(), circle.getType(), circle.area());

    Shape rect = new Rectangle(4, 3, "green");
    System.out.printf("Area of %s %s = %.0f\n",
            rect.getColor(), rect.getType(), rect.area());

    Shape triangle = new Triangle(3, 4, "blue");
    System.out.printf("Area of %s %s = %.2f\n",
            triangle.getColor(), triangle.getType(), triangle.area());
  }
}




