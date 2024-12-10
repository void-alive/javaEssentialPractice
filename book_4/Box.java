public class Box {
//  필드
//  width, height를 final로 만들면 : 수정 불가
  private int width, height;
  private char fillChar;

//  생성자
//  Box()의 기본값 : 가로 10, 세로 1
//  this. : 객체 자신의 멤버 호출
//  this() : 생성자가 다른 생성자 호출
  public Box(){
    this(10,1);
  }

//  private인 width, height값을 public으로 잠깐 받기
//  매개변수로 너비와 높이를 가진 생성자
//  this(10,1)로 인해 호출됨
  public Box(int width, int height){
    this.width = width;
    this.height = height;
  }

//  fillchar에 있는 문자를 width와 height만큼 그리기
  public void draw(){
    for(int i=0;i<height;i++){
      for(int j=0;j<width;j++){
        System.out.print(fillChar);
      }
      System.out.println();
    }
  }

//  char 데이터형인 c를 fillchar 필드(변수)에 넣기
//  필드(변수)의 setter -> 쓰기
  public void fill(char c){
    this.fillChar = c;
  }

  public static void main(String[] args){
    Box a=new Box();
    Box b=new Box(20,3);
    a.fill('*');
    b.fill('%');
    a.draw();
    b.draw();
  }
}
