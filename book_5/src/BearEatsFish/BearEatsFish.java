package BearEatsFish;

public class BearEatsFish {
  static Bear bear = new Bear(0, 0, 1);
  static Fish fish = new Fish(5, 5, 1);

  public static void main(String[] args) {
    System.out.println("** Bear의 Fish 먹기 게임을 시작합니다 ** ");

    while (true) {
//      bear와 fish의 위치가 같으면 끝
      if (bear.collide(fish)) {
        System.out.println("Bear Wins!!");
        break;
      }

//      게임판 출력
      int sero = 10;
      int garo = 20;
      char pan[][] = new char[sero][garo];
      for (int i = 0; i < sero; i++) {
        for (int j = 0; j < garo; j++) {
//          bear의 x,y좌표가 i(세로),j(가로)값과 같다면 bear.getShape() 출력
          if (bear.getX() == j && bear.getY() == i) {
            System.out.print(bear.getShape());
//            fish의 x,y좌표가 i(세로), j(가로) 값과 같다면 fish.getShape() 출력
          } else if (fish.getX() == j && fish.getY() == i) {
            System.out.print(fish.getShape());
//            그것도 아니면 그냥 '-'판 출력
          } else {
            pan[i][j] = '-';
            System.out.print(pan[i][j]);
          }
        }
        System.out.println();
      }
//      bear.move()와 fish.move()
      bear.move();
      fish.move();
    }
  }
}
