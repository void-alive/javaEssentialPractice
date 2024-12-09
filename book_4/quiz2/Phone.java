package quiz2;

public class Phone {
//  밖에서 수정 못하게 private
  private String name;
  private String tel;

//  생성자 : 밖에서 값을 받아야하니까 public
  public Phone(String name, String tel){
    this.name = name;
    this.tel = tel;
  }

//  getter : private 지정자인 name과 tel을 사용할 수 있도록 public으로
  public String getName(){return name;}
  public String getTel(){return tel;}
}
