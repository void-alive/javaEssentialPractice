package quiz2;

import java.util.Scanner;

public class Practice2 {
  public static void main(String[] args) {
    System.out.print("이름과 전화번호 입력 >> ");
    Scanner sc = new Scanner(System.in);
    String name = sc.next();
    String tel = sc.next();

    System.out.print("이름과 전화번호 입력 >> ");
    String name1 = sc.next();
    String tel1 = sc.next();
    Phone sponge = new Phone(name, tel);
    System.out.println(name + "의 번호 " + tel);
    Phone squid = new Phone(name1, tel1);
    System.out.println(name1 + "의 번호 " + tel1);

  }
}
