public class Car {
  private String brand;
  private String color;
  private int year;

//  문제 1
//  Car() {
//    this.brand = "1번 차";
//    this.color = "1번";
//    this.year = 2000;
//  }

//  문제 2
//  void : 단순히 출력만 해줌 (결과값 return 필요 x)
//  그 외 나머지 연산자 : 값을 바꾸거나 할 때 사용. return 필요
  public void drive() {
    System.out.println("차달려요");
  }

//  문제 3
//  매개변수 명과 필드 명이 같을 경우 this. 붙여서 정확히
  Car(String brand, String color, int year) {
    this.brand = brand;
    this.color = color;
    this.year = year;
  }

//  문제 4
//  getter : 값 읽기
//  호출한 곳으로 되돌려주기 위해 return 필요
  public String getBrand(){
    return brand;
  }
  public String getColor(){
    return color;
  }
  public int getYear(){
    return year;
  }

  //  setter : 값 바꾸기
  //  값을 저장하기 위한 것이라 return 필요 x -> void
  public void setBrand(String brand){
    this.brand = brand;
  }
  public void setColor(String color){
    this.color = color;
  }
  public void setYear(int year){
    this.year = year;
  }


//  문제 5
  public void printInfo(){
    System.out.println("브랜드 : " + brand);
    System.out.println("색상 : " + color);
    System.out.println("연식 : " + year);
  }

//  문제 6
  Car(){
    this.brand = "미정";
    this.color = "검정";
    this.year = 2000;
  }

  public static void main(String[] args) {
//    문제 1
    System.out.println("문제 1");
    Car car = new Car();
    System.out.println(car.brand);
    System.out.println(car.color);
    System.out.println(car.year);
    System.out.println();

//    문제 2
    System.out.println("문제 2");
    car.drive();
    System.out.println();

//    문제 3
    System.out.println("문제 3");
    Car car1 = new Car("Mercedes", "green", 2018);
    System.out.println(car1.brand);
    System.out.println(car1.color);
    System.out.println(car1.year);
    System.out.println();

//   문제 4
    System.out.println("문제 4");
//    바꾸기 전
    Car car2 = new Car("현대","ㅇㅅㅇ",2222);
    System.out.println(car2.brand);
    System.out.println(car2.color);
    System.out.println(car2.year);
    System.out.println();
//    바꾼 뒤
//    원래 private이라서 바꿀수 없는 값들이지만
//    public 속성을 가진 getter와 setter를 사용해서 간접적으로 수정
//    setter : 값을 수정함
//    getter : 수정한 값을 읽어옴
//    같은 클래스 내부에서는 private 접근 가능
//    제대로 실습하고 싶다면 다른 클래스를 만들어서 해보는 것추천
    car2.setBrand("가나다");
    car2.setColor("빨강");
    car2.setYear(2020);
    System.out.println(car2.getBrand());
    System.out.println(car2.getColor());
    System.out.println(car2.getYear());
    System.out.println();

//    문제 5
    System.out.println("문제 5");
    Car car3 = new Car("Mercedes", "green", 2018);
    car3.printInfo();
    System.out.println();

//    문제 6
    System.out.println("문제 6");
    Car car4 = new Car();
    System.out.println("브랜드 : " + car4.brand);
    System.out.println("색상 : " + car4.color);
    System.out.println("연식 : " + car4.year);
    System.out.println();

//    문제 7
    System.out.println("문제 7");
//    car5를 5개의 배열로 정의
    Car car5 [] = new Car[5];

//    car5.length(5)까지 5번 반복함
    for(int i=0;i<car5.length;i++){
//      객체 생성
      car5[i] = new Car( i + "번",i + "색",i);
    }
//    car5.length(5)까지 5번 출력함
    for(int i=0;i<car5.length;i++){
      System.out.print(car5[i].brand + " ");
      System.out.print(car5[i].color + " ");
      System.out.println(car5[i].year);
//      car5[i].printInfo();도 가능
    }
    System.out.println();
  }
}
