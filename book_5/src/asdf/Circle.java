package asdf;

public class Circle implements Shape {
  private int radius;

  public Circle(int radius) {
    this.radius = radius;
  }

  public void draw() {
    System.out.print("반지름 " + this.radius);
  }

  public double getArea() {
    return PI * this.radius * this.radius;
  }
}