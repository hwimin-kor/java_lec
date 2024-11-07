package pkg07_access_modifier;
/*
 * 객체지향 언어를 공부하다보면 
 * 정보은닉이라는 내용이나온다
 * 객체가 (인스턴스)가진 정보(데이터, 정확히 필드)는 안전하게 보호한다. 
 * 외부에서는 접근할 수 없도록 막는다. 
 */


/*
 * 접근 권한 
 * 1.public   : 누구나 접근 가능 (일반적으로 클래스,메소드의 권한)
 * 2.protected: 동일 패키지 or 상속 관계 클래스에서 접근 가능
 * 3.default  : 동일 패키지에서 접근가능(접근 권한이 없는 경우 사용됨)
 * 4.private  : 동일 클래스에서 접근 가능  (필드의 권한)
 */

/*
 * Getter와 Setter
 * 1.Getter: 필드 값을 반환하는 메소드. get + 필드명으로 이름을 만든다. 
 * 2.Setter: 필드 값을 저장하는 메소드. set + 필드명으로 이름을 만든다.
 * 3.이클립스의 코드 자동 완성 기능을 권장한다. 
 */

public class Sample {
  
  private String item;

  public String getItem() {
    return item;
  }

  public void setItem(String item) {
    this.item = item;
  }
 
}
