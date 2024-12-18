package BearEatsFish;

public class Fish extends GameObject {
//  fish의 모양 '@'
  char fishShape = '@';
  int count = 0;
  int fishMove = 0;
  int randomMove = 0;

//  GameObject에서 상속받은 생성자
  public Fish(int startX, int startY, int distance) {
    super(startX, startY, distance);
  }

//  move()함수 상속 후 오버라이딩
//  count는 한 번 할때마다 1씩 증가
//  fishMove는 count의 값을 5로 나눈 것
//  randomMove는 1~4의 값 출력
  @Override
  protected void move() {
    this.count = count + 1;
    this.fishMove = this.count % 5;
    this.randomMove = (int) (Math.random() * 4) + 1;

    if (fishMove == 4 || fishMove == 0) {
      switch (randomMove) {
        case 1:
          x = x - 1;
          getX();
          break;
        case 2:
          y = y + 1;
          getY();
          break;
        case 3:
          y = y - 1;
          getY();
          break;
        case 4:
          x = x + 1;
          getX();
          break;
      }
    }
  }

//  모양 출력
  @Override
  protected char getShape() {
    return fishShape;
  }
}
