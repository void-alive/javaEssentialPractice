public class bonus2_1 {
  public static void main(String[] args) {
    int numbers[] = {5,12,8,20,7};
    int big=0;
//    더 큰 수를 저잫아기 위한 변수
    
//    배열의 처음부터 마지막 index까지 반복
    for(int i=0;i<numbers.length;i++){
      if(i<numbers.length-1){
//        맨 끝의 한칸 남기기
        if(numbers[i]>numbers[i+1]){
          big = numbers[i];
        }
      }
    }
    System.out.println(big);
  }
}
