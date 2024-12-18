package BearEatsFish;

import java.util.Scanner;

public class Bear extends GameObject {
//  bearShape는 B
  char bearShape = 'B';
  Scanner sc = new Scanner(System.in);

//  GameObject의 생성자 상속받기
  public Bear(int startX, int startY, int distance) {
    super(startX, startY, distance);
  }

//  move()함수 상속
//  플레이어가 입력하는 값에 따라 한 칸씩 이동
//  만일 입력하는 값이 awsd중에 없다면 재입력 요구
  @Override
  protected void move() {
    System.out.print("왼쪽(a), 아래(s), 위(w), 오른쪽(d) >> ");
    String bearMove = sc.nextLine();
    switch (bearMove) {
      case "a":
        x = x - 1;
        getX();
        break;
      case "s":
        y = y + 1;
        getY();
        break;
      case "w":
        y = y - 1;
        getY();
        break;
      case "d":
        x = x + 1;
        getX();
        break;
      default:
        System.out.println("잘못된 입력입니다. 다시 입력해주세요. ");
        break;
    }
  }

//  모양 출력
  @Override
  protected char getShape() {
    return bearShape;
  }
}
