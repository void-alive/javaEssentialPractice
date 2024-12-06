public class quiz7 {
  public static void main(String[] args) {
    for (int i = 3; i < 30; i += 3) {
      int first = i / 10;
      int second = i % 10;
      System.out.println(i + " 박수한번");
      if (second == 9) {
        i = i + 4;
        if (i > 30) {
          i = i - 3;
        }
        System.out.println(i + " 박수한번");
      }
    }

    for(int i=31;i<40;i++){
      int second = i % 10;
      if(second==3 || second==6 || second==9){
        System.out.println();
        System.out.println(i+" 박수두번");
        System.out.println();

      }
      else{
        System.out.println(i + " 박수한번");
      }
    }

    for (int i = 42; i < 60; i += 3) {
      int first = i / 10;
      int second = i % 10;
      System.out.println(i + " 박수한번");
      if (second == 9) {
        i = i + 4;
        System.out.println(i + " 박수한번");
      }
    }

    for(int i=60;i<70;i++){
      int second = i % 10;
      if(second==3 || second==6 || second==9){
        System.out.println();
        System.out.println(i+" 박수두번");
        System.out.println();

      }
      else{
        System.out.println(i + " 박수한번");
      }
    }

    for (int i = 72; i < 90; i += 3) {
      int first = i / 10;
      int second = i % 10;
      System.out.println(i + " 박수한번");
      if (second == 9) {
        i = i + 4;
        System.out.println(i + " 박수한번");
      }
    }

    for(int i=90;i<100;i++){
      int second = i % 10;
      if(second==3 || second==6 || second==9){
        System.out.println();
        System.out.println(i + " 박수두번");
        System.out.println();

      }
      else{
        System.out.println(i + " 박수한번");
      }
    }
//    나중에 더 쉬운 방법 알아보기!
  }
}
