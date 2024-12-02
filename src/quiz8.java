import java.util.Scanner;

public class quiz8 {
  public static void main(String[] args) {
    System.out.println("컴퓨터와 가위바위보 게임을 합니다.");

//    case -> 사람 값
//    뭐시기 equals -> 컴퓨터 값
    while (true) {
//      컴퓨터의 랜덤 숫자
      int n = (int) (Math.random() * 3);
      String str[] = {"가위", "바위", "보"};
//      사람이 입력하기
      Scanner sc = new Scanner(System.in);
      System.out.print("가위 바위 보!>> ");
      String str1 = sc.nextLine();
//      컴퓨터가 가위, 사람이 (가위/바위/보)

      switch (str1) {
        case "가위": //컴퓨터 가위
          if (n == 0) {
            System.out.println("사용자 = " + str1 + ", 컴퓨터 = " + str[n] + ", 비겼습니다.");
          } else if (n == 1) {
            System.out.println("사용자 = " + str1 + ", 컴퓨터 = " + str[n] + ", 졌습니다.");
          } else {
            System.out.println("사용자 = " + str1 + ", 컴퓨터 = " + str[n] + ", 이겼습니다.");
          }
          break;
        case "바위": //컴퓨터 바위
          if (n == 0) {
            System.out.println("사용자 = " + str1 + ", 컴퓨터 = " + str[n] + ", 이겼습니다.");
          } else if (n == 1) {
            System.out.println("사용자 = " + str1 + ", 컴퓨터 = " + str[n] + ", 비겼습니다.");
          } else {
//          보
            System.out.println("사용자 = " + str1 + ", 컴퓨터 = " + str[n] + ", 졌습니다.");
          }
          break;
        case "보": //컴퓨터 보
          if (n == 0) {
            System.out.println("사용자 = " + str1 + ", 컴퓨터 = " + str[n] + ", 졌습니다.");
          } else if (n == 1) {
            System.out.println("사용자 = " + str1 + ", 컴퓨터 = " + str[n] + ", 이겼습니다.");
          } else {
            System.out.println("사용자 = " + str1 + ", 컴퓨터 = " + str[n] + ", 비겼습니다.");
          }
          break;
      }
      if (str1.equals("그만")) {
        System.out.println("게임을 종료합니다...");
        break;
      }
    }
  }
}

