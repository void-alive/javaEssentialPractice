import quiz2.Phone;

import java.util.Scanner;

public class Practice4 {
  public static void main(String[] args) {

//    인원수 입력받기
    System.out.print("인원수 >> ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String name = " ";
    String tel;

//    입력받은 인원수 만큼 배열 생성
    Phone array[] = new Phone[n];

//    이름과 전화번호 작성
    for (int i = 0; i < array.length; i++) {
      System.out.print("이름과 전화번호(번호는 연속적으로 입력) >> ");
      name = sc.next();
      tel = sc.next();
      array[i] = new Phone(name, tel);
    }

    System.out.println("저장되었습니다...");

//    이름 검색 및 전화번호 찾기
    while (true) {
      System.out.print("검색할 이름 >> ");
      name = sc.next();
      if (name.equals("exit")) {
        System.out.println("프로그램을 종료합니다...");
        break;
      }
//      전화번호 찾아서 보내기
      int i = 0;
      for (i = 0; i < array.length; i++) {
        if (name.equals(array[i].getName())) {
          System.out.println(name + "의 번호는 " + array[i].getTel() + " 입니다.");
          break;
        }
      }
      if (i == array.length) {
        System.out.println(name + "이 없습니다");
      }
    }
    sc.close();
  }
}
