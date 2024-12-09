// default 클래스 : 다른 패키지 안에 있으면 사용 불가
class Circle {
  private int radius;

  public Circle(int radius) {
    this.radius = radius;
  }

  public int getRadius() {
    return this.radius;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }
}

class CircleManager {
  static void copy(Circle src, Circle dest) {
    dest.setRadius(src.getRadius());
  }

  static boolean equals(Circle a, Circle b) {
    if (a.getRadius() == b.getRadius()) {
      return true;
    } else {
      return false;
    }
  }
}

public class StaticTest {
  public static void main(String[] args) {
    Circle pizza = new Circle(5);
    Circle waffle = new Circle(1);

    boolean result = pizza.equals(waffle);
    if (result == true)
      System.out.println("pizza와 waffle 크기 같음");
    else
      System.out.println("pizza와 waffle 크기 다름");

    CircleManager.copy(pizza, waffle);
    result = CircleManager.equals(pizza, waffle);
    if (result == true)
      System.out.println("pizza와 waffle 크기 같음");
    else
      System.out.println("pizza와 waffle 크기 다름");
  }
}

