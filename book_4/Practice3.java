import java.util.Scanner;

public class Practice3 {
  public static void main(String[] args) {
    Rect rect[] = new Rect[4];
    Scanner sc = new Scanner(System.in);
    int width, height;
    int sum=0;

    for(int i=0;i<rect.length;i++){
      System.out.print((i+1) + " 너비와 높이 >> ");
      width = sc.nextInt();
      height = sc.nextInt();
      rect[i] = new Rect(width,height);
    }
    System.out.println("저장하였습니다...");
    for(int i=0;i<rect.length;i++){
      sum = sum + rect[i].getArea();
    }
    System.out.println("사각형의 전체 합은 " + sum);

  }
}
