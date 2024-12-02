import java.util.Scanner;

public class quiz2 {
  public static void main(String[] args) {
    System.out.print("정수 10개 입력 >> ");
    Scanner sc = new Scanner(System.in);
//    배열 생성
    int intArray[];
//    10칸
    intArray = new int[10];

//    i번째 값에 정수값 스캔해서 넣기
    for (int i = 0; i < intArray.length; i++) {
      intArray[i] = sc.nextInt();
//      만약에 i번째 값을 3으로 나눈게 0이면 출력
      if (intArray[i] % 3 == 0) {
        System.out.print(intArray[i] + " ");
      }
    }
  }
}
