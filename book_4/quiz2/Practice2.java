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

    /* Scanner sc = new Scanner(System.in);
     * System.out.println("뭔가 입력");
     * String name = sc.nextLine();
     * String tel = sc.nextLine();
     * Phone phone1 = new Phone(이름, 전화번호);
     *
     * System.out.println("뭔가 입력");
     * name = sc.nextLine();
     * tel = sc.nextLine(); -> 위에서 name과 tel 변수를 받았기 때문에 재활용
     * Phone phone2 = new Phone(이름, 전화번호);
     *
     * System.out.println("나머지 출력");
     * */

    /*
     배열
    * Phone phone1 [] = new Phone[2]
    * for(int i=0;i<phone1.length;i++){
    *  System.out.println("전화번호 입력");
    *  name[i] = sc.nextLine();
    *  tel[i] = sc.nextline();
    *  phone[i] = new Phone1(name, tel);
    * }
    *
    * for(int i=0;i<phone1.length;i++){
    *  System.out.println(phone1[i].getName() + "의 번호 " + phone1[i].getTel();
    * }
    *  */
  }
}
