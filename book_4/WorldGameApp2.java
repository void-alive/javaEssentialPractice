import java.util.Scanner;

public class WorldGameApp2 {
  public static void main(String[] args) {
//    WorldClassApp 시작

    String name;
    String word = "아버지";
    String word2;
    Scanner sc = new Scanner(System.in);

//  인원 수 입력받기
    System.out.print("게임에 참가하는 인원은 몇명입니까? >> ");
    int n = sc.nextInt();

//    입력한 인원 수만큼 배열 생성
    Player array[] = new Player[n];

    for (int i = 0; i < array.length; i++) {
      System.out.print("참가자의 이름을 입력하세요 >> ");
      name = sc.next();
      array[i] = new Player(name);
    }
//World class app 종료


//    run 시작
//    게임 시작
//    System.out.println("시작은 아버지입니다.");
    System.out.println("시작하는 단어는 " + word + "입니다");
    int next = 0;
    String lastWord = word;

    while(true){
      String newWord = array[next].getWord();
      if(!array[next].succeed(lastWord)){
        System.out.println(array[next].getName() + "이 졌습니다.");
        return;
      }

      ++next;
      next %= array.length;
      lastWord = newWord;
    }
//    while(true){
////      만일 전에 입력한 마지막 글자와 지금 입력한 첫 글자가 같지 않으면 break;
////      if(array[].getWord != )
////      반복문
//      for(int i = 0; i < array.length; i++){
//        System.out.print(array[i].getName() + ">> ");
//        array[i].getWord(word2 = sc.next());
//        System.out.println(array[i]);
//        System.out.println(word2.equals(array[i]));
//      }
//    }
  }
}
