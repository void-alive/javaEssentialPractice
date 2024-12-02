import java.util.Scanner;

public class quiz6_1 {
  public static void main(String[] args) {
    String eng[] = {"student", "love", "java", "happy", "future"};
    String kor[] = {"학생", "사랑", "자바", "행복", "미래"};

    while (true) {
      System.out.print("영어 단어를 입력하세요 >> ");
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();

      if (str.equals("exit")) {
        System.out.println("종료합니다...");
        break;
      } else {
        int i = 0;
        for (i = 0; i < eng.length; i++) {
          if (str.equals(eng[i])) {
            System.out.println(kor[i]);
            break;
          }
        }
        if (eng.length == i) {
          System.out.println("그런 영어단어가 없습니다.");
        }
      }
    }
  }
}
