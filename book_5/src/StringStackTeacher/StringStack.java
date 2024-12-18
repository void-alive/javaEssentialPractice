package StringStackTeacher;

import java.util.Stack;

public class StringStack implements StackInterface {
  //  저장할 데이터의 위치
  private int index = 0;
  //  스택 구조로 배열 생성
  private String[] stack;

//  배열의 크기
  public StringStack(int size) {
    stack = new String[size];
  }

//  배열(스택)에 저장된 데이터의 개수 출력
  @Override
  public int length() {
    return index;
  }

//  배열에서 데이터 출력
  @Override
  public String pop() {
    if(index==0){
      return "스택이 비었습니다";
    }
    index--;
    return stack[index];
  }

//  스택에 데이터 저장
  @Override
  public boolean push(String ob) {
    if(index<stack.length) {
//      선 저장, ++
      stack[index] = ob;
      index++;
      return true;
    }
    return false;
  }
}
