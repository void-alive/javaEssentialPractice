import java.util.Scanner;

public class Player {
  //글자, 인원수
  private String name;
  private String word;
  Scanner sc;

//  이름 받기
  public Player(String name) {
    this.name = name;
    this.sc = new Scanner(System.in);
  }

  public String getName() {
    return this.name;
  }

//  뭔가 단어 말하기
  public String getWord() {
    System.out.print(this.name + ">> ");
    this.word = this.sc.next();
    return this.word;
  }

//  마지막 단어랑 첫 단어랑 같은지 확인하기
  public boolean succeed(String lastWord){
    int lastIndex = lastWord.length() - 1;
    return lastWord.charAt(lastIndex) == this.word.charAt(0);
  }
//  void checkSuccess() {
//    String word = "아버지";
//    int lastIndex = word.length() - 1;
//    char lastChar = word.charAt(lastIndex);
//    char firstChar = word.charAt(0);
//  }
}