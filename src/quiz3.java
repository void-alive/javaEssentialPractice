import java.util.InputMismatchException;
import java.util.Scanner;

public class quiz3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("정수를 입력하세요 >> ");
    int n = 0;
    try {
      n = sc.nextInt();
      switch (n % 2) {
        case 0:
          System.out.println("짝수");
          break;
        default:
          System.out.println("홀수");
          break;
      }
    } catch (InputMismatchException e) {
      System.out.println("수를 입력하지 않아 프로그램을 종료합니다.");
    } finally {
      sc.close();
    }
  }
}
