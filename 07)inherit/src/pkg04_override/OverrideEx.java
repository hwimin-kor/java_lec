package pkg04_override;
/*
 * 메소드 오버라이드 
 * 1.부모 클래스의 메소드를 자식 클래스가 다시 만드는것이다.
 * 2.동일한 메소드로 만들어야 한다 이름 반환 모두다 
 * 3.오버라이드 할 때 @Override Annotation 을 추가한다. 
 *  1)오버라이드를 안붙혀도 되지만 붙히는 이유?
 *  1-1)문법 검사를 수행해준다
 *  1-2)오버라이드 한 메소드임을 다른 개발자에게 알린다. 
 *  
 */

public class OverrideEx {

  public static void main(String[] args) {
    BlackCoffee black = new BlackCoffee();
    MixCoffee mix = new MixCoffee();
    mix.taste(); //오버라이드한 메소드가 호출 될 것이다 
    black.taste();// 블랙커피의 테이스트 메소드가 호출됨
  }

}
