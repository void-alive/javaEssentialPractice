import java.util.Scanner;

public class quiz5 {
  public static void main(String[] args) {
    System.out.print("정수 10개 입력 >> ");
    Scanner sc = new Scanner(System.in);

    // 배열 생성 (10개의 정수를 저장할 배열)
    int intArray[] = new int[10];

    // 정수 10개를 입력받아 배열에 저장
    for (int i = 0; i < intArray.length; i++) {
      intArray[i] = sc.nextInt();
    }

    // 버블 정렬: 큰 숫자가 앞에 오도록 정렬
    for (int i = 0; i < intArray.length; i++) {
      for (int j = i; j < intArray.length; j++) {
        // 두 값을 비교하여 순서가 잘못된 경우 교환
        if (intArray[i] > intArray[j]) {
          // 값 교환
          int temp = intArray[i];
          intArray[i] = intArray[j];
          intArray[j] = temp;
        }
      }
    }

    // 정렬된 배열 출력
    System.out.print("정렬된 값: ");
    for (int i = 0; i < intArray.length; i++) {
      System.out.print(intArray[i] + " ");
    }

  }
}