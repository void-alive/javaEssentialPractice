import java.util.Scanner;

public class bonus3 {
  public static void main(String[] args) {
    int numberArr[] = {3,7,5,1,8,4,9,2,6,5,7,1,3,8,9,2,4,6,5,7};
    Scanner sc = new Scanner(System.in);
    System.out.print("숫자를 입력하세요 > ");
    int n=sc.nextInt();
    int sum=0;

    for(int i=0;i<numberArr.length;i++){
      if(n == numberArr[i]){
        sum +=1;
      }
    }
    System.out.println(sum + "개");
  }
}
