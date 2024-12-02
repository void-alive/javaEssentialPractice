import java.util.Scanner;

public class quiz5 {
  public static void main(String[] args) {
    System.out.print("정수 10개 입력 >> ");
    Scanner sc = new Scanner(System.in);
//    배열 생성
    int intArray[];
//    10칸
    intArray = new int[10];
    int bubble = 0;

//    i번째 값에 정수값 스캔해서 넣기
    for (int i = 0; i < intArray.length; i++) {
      intArray[i] = sc.nextInt();
//     큰 숫자가 앞으로 오도록 정렬
//      if (intArray[i + 1] > intArray[i]) {
//        intArray[i] = intArray[i + 1];
//        bubble = intArray[i];
//        intArray[i + 1] = intArray[i];
//      }
      System.out.println(intArray[i]);

    }
  }
}
