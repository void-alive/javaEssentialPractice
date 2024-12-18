import java.util.Arrays;
import java.util.Scanner;

//인터페이스 StackInterface : 나중에 구현할것
interface StackInterface {
  int length();
  String pop();
  boolean push(String ob);
}

//StackInterface를 구현하는 StringStack 클래스
public class StringStack implements StackInterface {
  static String words[] = new String[5];
  static String temp[] = new String[words.length];
  static String removedString[] = new String[words.length];
  Scanner sc = new Scanner(System.in);

  //length() 함수 구현
//  5개의 단어를 입력받음.
//  words의 길이값 반환
  public int length() {
    System.out.print(">> ");
    for (int i = 0; i < words.length; i++) {
      words[i] = sc.next();
    }
    return words.length;
  }

  //  pop()함수 구현
//  임의로 만든 배열 temp에다가 words에 값을 옮겨넣음
  public String pop() {
    for (int i = 0; i < temp.length; i++) {
      temp[i] = words[i];
    }
//     옮겨넣은 값을 다시 removedString으로 옮김
    for (int i = 0; i < temp.length; i++) {
      removedString[i] = words[temp.length - i - 1];
    }
//    temp의 값은 words에 넣고 temp에는 null값 넣기 (temp 비우기)
    words = temp;
    temp = null;
    return removedString[0];
  }

  //  push()함수 구현
//  removedString에 있는 값 출력
  public boolean push(String ob) {
    for (int i = 0; i < words.length; i++) {
      System.out.print(removedString[i] + " ");
    }
    return true;
  }

  //  클래스 변수 s를 만들고 StringStack이라는 객체 넣기
//  이후 시작
  public static void main(String[] args) {
    StringStack s = new StringStack();
    s.length();
    s.pop();
    s.push(removedString[0]);
  }
}
