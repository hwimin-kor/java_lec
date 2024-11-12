package pkg10_interface.B_extends;

 /*다중인터페이스구현
  * 1.여러 인터페이스를 구현할 수 있다.
  * 2.다중 상속의 효과를 낼 수 있다.
  * 3.모든 인터페이스의 모든 추상 메소드를 구현해야 한다.
  */

public class SmartPhone implements Computer ,Phone{

    @Override
    public void powerOn() {
      // TODO Auto-generated method stub
      System.out.println("전원on");
    }
    @Override
    public void powerOff() {
    // TODO Auto-generated method stub
      System.out.println("전원off");
    
    }
    @Override
    public void game() {
    // TODO Auto-generated method stub
      System.out.println("게임");
    
    }@Override
    public void call() {
    // TODO Auto-generated method stub
      System.out.println("전화");
    
    }
    @Override
    public void sms() {
    // TODO Auto-generated method stub
      System.out.println("문자");
    
    }
}
