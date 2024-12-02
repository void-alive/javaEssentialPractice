public class bonus1 {
  public static void main(String[] args) {
    int intArray[][];
    intArray =new int[3][4];

    for(int i=0;i<3;i++){
      for(int j=0;j<4;j++){
        intArray[i][j]=(int)(Math.random()*10);
      }
    }

    for(int i=0;i< intArray.length;i++){
      System.out.println();
      for(int j=0;j<intArray[i].length;j++){
        System.out.print(intArray[i][j]+" ");
      }
    }

    int i=0,sum=0;
    while(i<3){
      for(int j=0;j<intArray[i].length;j++){
        sum+=intArray[i][j];
      }
      i++;
    }
    System.out.println(sum);
  }
}
