import java.util.Scanner;

//추상 클래스이므로 구현(implements)가 아닌 상속(extends)로 해결
abstract class Calculator {
//  protected : 상속 받은 클래스만 사용 가능
  protected int a, b;

//  추상메소드. 자식 클래스에서 반드시 구현할 것
  abstract protected int calc();

  protected void input() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("정수 2개를 입력하세요 >> ");
    a = scanner.nextInt();
    b = scanner.nextInt();
  }

  public void run() {
    input();
    int res = calc();
    System.out.println("계산된 값은 " + res);
  }
}

//추상 클래스 상속 : extends
//인터페이스 구현 : implements
class Adder extends Calculator {
  protected int calc(){
    return a+b;
  }
}

class Subtract extends Calculator {
  protected int calc(){
    return a-b;
  }
}

public class App {
  public static void main(String[] args) {
    Adder adder = new Adder();
    Subtract sub = new Subtract();

    adder.run();
    sub.run();
  }
}
