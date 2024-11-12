package pkg09_abstract;
/*
 * Animal 은 추상 클래스이다
 * 추상클래스는 추상 메소드를 가지고 있는 클래스이다.
 * 클래스 앞에 abstract 메소드를 가지고있다
 * <추상 클래스의 특징>
 * --추상 클래스를 상속 받는 클래스들은 반드시 모든 추상 메소드(move) 를 오버라이드 해야한다. 
 * --추상 클래스는 인스턴스를 생성할 수 없다. new Animal()불가능함 
 */
public abstract class Animal {
/*
 * 추상 메소드 
 * -본문이 없는 메소드이다{}
 * -메소드 앞에 abstract 라고하는 키워드를 추가해야한다.
 */
  public abstract void move();
}
