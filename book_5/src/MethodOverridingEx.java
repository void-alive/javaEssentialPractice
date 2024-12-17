import java.util.Scanner;
import java.util.ArrayList;

//예제의 shape 클래스
class Shape {
  public String draw() {
    return "Shape";
  }
}

//Shape 클래스를 상속받는 Line클래스
class Line extends Shape {
  public String draw() {
    return "Line";
  }
}

//Shape 클래스를 상속받는 Rect클래스
class Rect extends Shape {
  public String draw() {
    return "Rect";
  }
}

//Shape 클래스를 상속받는 Circle클래스
//폴더 안에 Circle 클래스 다른게 하나 더 있어서 Circle1로 함
class Circle1 extends Shape {
  public String draw() {
    return "Circle";
  }
}

//메소드 오버라이딩 클래스
public class MethodOverridingEx {
  //  static : 이 클래스 내부에서 어디에서든지 사용 가능하게 만듦
//  클래스와 같은 메모리 공간에 저장
//  클래스가 생기면 생기고 사라지면 사라짐
//  동적 배열 : 배열 크기를 늘리고 줄일 수 있음
  static ArrayList<Shape> array = new ArrayList<Shape>(5);

  //  paint 클래스
//  Shape 클래스에 변수를 할당하고 그 변수의 draw()메소드 실행하여 반환함
  static String paint(Shape p) {
    return p.draw();
  }

  //  메인
  public static void main(String[] args) {

//    스캐너와 num, caseNum변수 준비
    Scanner sc = new Scanner(System.in);
    int num;
    int caseNum;

//    무한반복
    while (true) {
      System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> ");
      num = sc.nextInt();

//      입력받은 num이 4면 프로그램 종료
      if (num == 4) {
        System.out.println("프로그램을 종료합니다...");
        break;
      }

//      num 변수 안의 값이 1인지, 2인지, 3인지에 따라서 결과가 달라짐
      switch (num) {

//        1이면 삽입
        case 1:
          System.out.print("도형 종류 Line(1), Rect(2), Circle(3) >> ");
          caseNum = sc.nextInt();

//          두번째 caseNum받음. Line을 그릴지 Rect를 그릴지 Circle을 그릴지
          switch (caseNum) {
            case 1:
              System.out.println("line을 그립니다");
              array.add(new Line());
              break;
            case 2:
              System.out.println("Rect을 그립니다");
              array.add(new Rect());
              break;
            case 3:
              System.out.println("Circle을 그립니다");
              array.add(new Circle1());
              break;
          }
          break;

//          삭제
//        caseNum값을 입력받음.
//        만약에 caseNum에서 1을 뺀 값이 (배열은 0부터 시작하니까 1을 뺌)
//        array.size()보다 크다면 삭제할 수 없습니다. 출력하고 건너뛰기
//        아니라면 caseNum에서 1을 뺀 값 삭제
        case 2:
          System.out.print("삭제할 도형의 위치 >> ");
          caseNum = sc.nextInt();
          if (caseNum - 1 >= array.size()) {
            System.out.println("삭제할 수 없습니다.");
            continue;
          }
          array.remove(caseNum - 1);
          break;

//          전부 보기
//        향상된 for문
//        Shape 클래스의 변수 shape를 array길이만큼 반복함
//        shape가 공란이라면 반복 x

//        for(변수 : 배열 레퍼런스)
//        반복 작업문...
        case 3:
          for (Shape shape : array) {
            if (shape != null) {
              System.out.println(shape.draw());
            }
          }
          break;
      }
    }
  }
}
