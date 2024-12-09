package quiz1;

public class Song {
  String title;
//  private String title; -> title을 함부로 수정하지 못하게 함
//  필드 선언. 외부 접근을 막기 위해 private 선언

//  생성자 : 외부에서 객체를 만들어야 하기 때문에 public
  public Song(String title) {
    this.title = title;
  }

//  메소드(get) : private이라 밖에서 못 보는 title을 public 메소드를 사용해줌으로써 밖에서도 볼 수 있게 만들어줌
//  필드의 내용을 외부에서 사용할 수 있도록 하기 위한 getter. public 지정자 사용
  public String getTitle() {
    return title;
  }
}

