class Circle{
//  radius 필드를 생성한다
  private int radius;

//  Circle 생성자 (radius값을 받는다)
  public Circle (int radius){
    this.radius = radius;
  }

//  private으로 읽을 수 없는 radius를 getRadius를 사용해 읽을 수 있게 한다
  public int getRadius(){
    return radius;
  }
}

//Circle을 상속받는 클래스
class NamedCircle extends Circle {
//  name 필드 생성
  private String name;

//  radius와 name을 매게변수로 받는 NamedCircle 생성자를 만든다
//  radius는 부모 클래스에서 가져온 것이므로 super(radius)를 사용해 radius값을 넣는다
//  name을 이 필드의 name 변수에 넣는다
  public NamedCircle (int radius, String name){
    super(radius);
    this.name = name;
  }

//  show() 메소드 (이름과 반지름을 출력한다. 리턴 값이 없기 때문에 void를 사용)
  public void show(){
    System.out.println(this.name + ", 반지름 = " + this.getRadius());
  }

//  출력
  public static void main(String[] args){
    NamedCircle w = new NamedCircle(5, "Waffle");
    w.show();
  }
}
