public class Calculator {

//  add 메서드를 생성한다. num1과 num2라는 매개변수를 받는다
//  num1을 필드에 있는 num1에 넣고, num2도 똑같이 한다
//  add 변수를 만든다. 이 변수에는 num1과 num2를 더한 값이 들어있다
//  add 값을 리턴한다
  public int add(int num1, int num2){
    return num1 + num2;
  }

  //  multiply 메서드를 생성한다. num1과 num2라는 매개변수를 받는다
//  num1을 필드에 있는 num1에 넣고, num2도 똑같이 한다
//  muitiply 변수를 만든다. 이 변수에는 num1과 num2를 더한 값이 들어있다
//  multiply 값을 리턴한다
  public int multiply(int num1, int num2){
    return num1 * num2;
  }

//
  public static void main(String [] args){
//    Calculator 클래스를 calc라는 변수에 넣는다
    Calculator calc = new Calculator();
    System.out.println(calc.add(10, 20));
    System.out.println(calc.multiply(10, 20));
  }

}
