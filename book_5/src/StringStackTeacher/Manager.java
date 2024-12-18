package StringStackTeacher;

import java.util.Scanner;

public class Manager {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringStack stack = new StringStack(10);

    System.out.println("문자 5개를 입력하세요 >> ");
    for (int i = 0; i < 5; i++) {
      stack.push(sc.next());
    }

//    pop 실행 후에는 저장된 데이터의 크기가 변경되므로
//    미리 저장된 크기 받기
    int size = stack.length();

    for (int i = 0; i < size; i++) {
      System.out.print(stack.pop() + " ");
    }
    sc.close();
  }
}
