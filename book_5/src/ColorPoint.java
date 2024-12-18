//부모 클래스 Point
class Point {
  //  필드 : private (외부에서 확인 및 수정 불가)
  private int x, y;

  // 매개변수를 2개 받는 Point 생성자 : x와 y를 초기화함
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  //getX() 메소드 : private이라 밖에서 볼 수없는 X를 리턴해 볼 수 있게 해줌
  public int getX() {
    return x;
  }

  //getY() 메소드 : private이라 밖에서 볼 수없는 Y를 리턴해 볼 수 있게 해줌
  public int getY() {
    return y;
  }

  //move(x,y)메소드 : x와 y를 새 값으로 초기화함
//  필드 값을 수정하는 메소드
  protected void move(int x, int y) {
    this.x = x;
    this.y = y;
  }
}

//Point의 상속을 받는 ColorPoint 클래스
class ColorPoint extends Point {
  //  필드
  String color;

  //  생성자 : x와 y를 사용 가능한 이유는 상속받았기 때문
//  super(x,y) : 부모 클래스의 생성자를 사용함. 제일 먼저 호출
  public ColorPoint(int x, int y, String color) {
    super(x, y);
    this.color = color;
  }

  //  메소드
//  super.move(x,y) : 부모 클래스의 move(x,y) 메소드 사용
//  원래는 값을 바꾸지 못하지만(private) move 메소드로 간접적으로 바꿀 수 있음
  public void setPoint(int x, int y) {
    super.move(x, y);
  }

  //  색깔 지정 메소드
  public void setColor(String color) {
    this.color = color;
  }

  //  출력 메소드
//  getX(), getY() : 현재 값을 반환해 볼 수 있게 해줌
  public void show() {
    System.out.print(this.color + "색으로 ");
    System.out.println("(" + getX() + ", " + getY() + ")");
  }

  //  메인 및 출력
  public static void main(String[] args) {
    ColorPoint cp = new ColorPoint(5, 5, "Yellow");
    cp.setPoint(10, 20);
    cp.setColor("Green");
    cp.show();
  }
}