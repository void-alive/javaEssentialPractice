public class Rectangle {
  //  필드(변수)로 width 와 height 지정
  private int width;
  private int height;

  //  생성자 (width값과 height 값을 받는다)
//  그리고 받은 width값과 height값을 Rectangle 클래스의 변수에 각각 넣음
  Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
  }

  //  getArea 메서드(함수)
//  result라는 값을 만든다. result에는 width 와 height를 곱한 값이 들어간다.
//  그 후, result 값을 리턴한다. (나중에 쓰일수도 있으니 저장!)
  public int getArea() {
    return width * height;
    //    혹은 int result = width * height;
    //    return result;
  }

//  getter 랑 setter
//  public int getWidth() {
//    return width;
//  }
//  public void setWidth(int width) {
//    this.width = width;
//  }
//  public int getHeight() {
//    return height;
//  }
//  public void setHeight(int height) {
//    this.height = height;
//  }

  public static void main(String[] args) {
//    Rectangle 생성자를 사용해 객체를 만든다.
//    객체 이름(레퍼런스)는 rec, width는 10, height는 20으로 지정한다
    Rectangle rec = new Rectangle(5, 4);
//    rec의 getArea() 메서드를 실행한다
    System.out.println("가로는 : " + rec.width);
    System.out.println("세로는 : " + rec.height);
    System.out.println("너비는 : " + rec.getArea());
  }
}
