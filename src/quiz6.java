import java.util.Scanner;

public class quiz6 {
  public static void main(String[] args) {
    String eng[] = {"student", "love", "java", "happy", "future"};
    String kor[] = {"학생", "사랑", "자바", "행복", "미래"};

    while (true) {
      System.out.print("영어 단어를 입력하세요 >> ");
      Scanner sc = new Scanner(System.in);
      String writeEng = sc.nextLine();

      switch (writeEng) {
        case "student":
          System.out.println(kor[0]);
          break;
        case "love":
          System.out.println(kor[1]);
          break;
        case "java":
          System.out.println(kor[2]);
          break;
        case "happy":
          System.out.println(kor[3]);
          break;
        case "future":
          System.out.println(kor[4]);
          break;
        case "exit":
          break;
        default:
          System.out.println("그런 단어가 없습니다");
          break;
      }
      if(writeEng.equals("exit")){
        System.out.println("종료합니다...");
        break;
      }

      /* if (str.equals("exit")){
      System.out.println("종료합니다...");
      break;
      }
      else{
      for(int i=0;i<eng.length;i++{
      if(str.equals(eng[i])){
      System.out.println(kor[i]);
      break;
      }

       */
    }
  }
}
