// default 클래스 : 다른 패키지 안에 있으면 사용 불가
class Circle {
//  private 접근자를 사용하는 필드(변수). 반지름 저장
  private int radius;

//  매개변수 하나를 가지는 생성자. 필드(변수) radius의 값을 초기화(대입)할 때 사용
  public Circle(int radius) {
    this.radius = radius;
  }

//  private으로 선언된 radius 변수를 public으로 읽어옴 (간접적으로 확인 가능)
//  필드(변수) radius의 getter -> 읽기
  public int getRadius() {
    return this.radius;
  }

//  private으로 선언된 radius 변수를 public으로 수정 (간접적 수정)
//  필드(변수) radius의 setter -> 쓰기
  public void setRadius(int radius) {
    this.radius = radius;
  }
}

class CircleManager {
//  클래스랑 같은 메모리 공간에 있음. 클래스가 생성될 때 생성되고, 소멸될 때 같이 소멸됨
//  이름은 스태틱. 스태틱이 아닌 건 인스턴스 변수라고 함 (스태틱 외에 다른 평범한 메소드들)
//  src를 dest에 복사
//  정적 멤버. 매개변수로 Circle 클래스 타입의 객체 2개 사용
  static void copy(Circle src, Circle dest) {
//    원본의 반지름 값을 받아서 사본에 저장
    dest.setRadius(src.getRadius());
  }

//  a의 반지름과 b의 반지름이 같은지 확인.
  static boolean equals(Circle a, Circle b) {
    if (a.getRadius() == b.getRadius()) {
      return true;
    } else {
      return false;
    }
//    단순화
//    result a.retRadius() == b.getRadius();
  }
}

public class StaticTest {
  public static void main(String[] args) {
//    클래스에 객체 이름 (레퍼런스) 선언
    Circle pizza = new Circle(5);
    Circle waffle = new Circle(1);

//    pizza랑 waffle이 같은지 확인
    boolean result = pizza.equals(waffle);
//    boolean result = CircleManager.equals(pizza, waffle);

    if (result == true)
//      if (result) 단순화
      System.out.println("pizza와 waffle 크기 같음");
    else
      System.out.println("pizza와 waffle 크기 다름");

//    pizza를 waffle에 복사
    CircleManager.copy(pizza, waffle);
    result = CircleManager.equals(pizza, waffle);
    if (result == true)
//      if (result) 단순화
      System.out.println("pizza와 waffle 크기 같음");
    else
      System.out.println("pizza와 waffle 크기 다름");
  }
}

