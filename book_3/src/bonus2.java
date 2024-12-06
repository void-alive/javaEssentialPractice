public class bonus2 {
  public static void main(String[] args) {
    int numbers[] = {5,12,8,20,7};
    for (int i = 0; i < numbers.length - 1; i++) {
      for (int j = 0; j < numbers.length - 1 - i; j++) {
        // 두 값을 비교하여 순서가 잘못된 경우 교환
        if (numbers[j] < numbers[j + 1]) {
          // 값 교환
          int temp = numbers[j];
          numbers[j] = numbers[j + 1];
          numbers[j + 1] = temp;
        }
      }
    }
    System.out.println(numbers[0]);
  }
}
