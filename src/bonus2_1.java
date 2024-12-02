public class bonus2_1 {
  public static void main(String[] args) {
    int numbers[] = {5,12,8,20,7};
    int big=0;
//    더 큰 수를 저잫아기 위한 변수
    
//    배열의 처음부터 마지막 index까지 반복
    for(int i=0;i<numbers.length;i++){
      if(i<numbers.length-1){
//        i+1인 index가 배열의 마지막 index를 넘지 못하도록 함
//        배열.length-1은 해당 배열의 마지막 index가 됨
//        i가 마지막 index까지 못가고, i+1이 마지막 index가 되도록 함
        if(numbers[i]>numbers[i+1]){
//          i index인 값과 i+1 index인 값을 비교하여 i의 값이 더 큰 경우
//          변수에 저장
          big = numbers[i];
        }
      }
    }
    System.out.println(big);
  }
}
