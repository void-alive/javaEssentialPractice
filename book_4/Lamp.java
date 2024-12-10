public class Lamp {
  //  bool 값을 가지는 inOn 변수를 만든다
  private boolean inOn;

  //  turnOn 메서드
  //  inOn을 true 값으로 만든다
  public void turnOn() {
    inOn = true;
  }

  //  turnOff 메서드
  //  inOn을 false 값으로 만든다
  public void turnOff() {
    inOn = false;
  }

  //  printStatus() 메소드
  //  inOn이 true인지 false인지 확인하고 값을 출력한다
  //  단순히 출력만 하면 되니까 void로 지정
  //  반환한다 : return
  public void printStatus() {
    if (inOn==true) {
      System.out.println("램프는 켜져있습니다.");
    } else {
      System.out.println("램프는 꺼져있습니다.");
    }
  }

  public static void main(String[] args) {
  //    lamp 객체를 생성한다
    Lamp lamp = new Lamp();
  //    램프를 끄는 메서드(함수)를 실행하고 결과를 출력한다
    lamp.turnOff();
    lamp.printStatus();

  //    램프를 켜는 메서드(함수)를 실행하고 결과를 출력한다
    lamp.turnOn();
    lamp.printStatus();
  }
}
