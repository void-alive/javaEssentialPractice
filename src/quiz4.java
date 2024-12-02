import java.util.InputMismatchException;
import java.util.Scanner;

public class quiz4 {
  public static void main(String[] args) {
    String day[] = {"일", "월", "화", "수", "목", "금", "토"};
    Scanner sc = new Scanner(System.in);
    int n = 0;

    while (true) {
      System.out.print("정수를 입력하세요 >> ");
      try {
        n = sc.nextInt();
        switch (n % day.length) {
          case 0:
            System.out.println("일");
            break;
          case 1:
            System.out.println("월");
            break;
          case 2:
            System.out.println("화");
            break;
          case 3:
            System.out.println("수");
            break;
          case 4:
            System.out.println("목");
            break;
          case 5:
            System.out.println("금");
            break;
          case 6:
            System.out.println("토");
            break;
        }
      } catch (InputMismatchException e) {
        System.out.println("경고! 수를 입력하지 않았습니다.");
        sc.next();
        n--;
        continue;
      }
      if (n < 0) {
        System.out.println("프로그램 종료합니다...");
        break;
      }
    }
  }
}
