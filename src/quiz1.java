
import java.util.Scanner;

public class quiz1 {
  public static void main(String[] args) {
    System.out.print("알파벳 한 문자를 입력하세요 >> ");
    Scanner sc = new Scanner(System.in);
    String string1 = sc.next();
    char char1 = string1.charAt(0);
//    입력받은 문자를 숫자로 변환
    int num1 = (int) char1;
    System.out.println(num1);

    for (int i = num1; i >= 97; i--) {
      for (int j = 97; j <= i; j++) {
        System.out.print((char) j);
      }
      System.out.println();
    }
  }
}
