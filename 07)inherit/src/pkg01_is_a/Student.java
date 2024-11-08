package pkg01_is_a;

/*
 * 자식 클래스
 * 서브 클래스
 */

/*
 * 상속
 * 1.부모 클래스가 가진 기능(메소드)을 자식 클래스가 자신의 것처럼 사용할 수 있다. 
 * 2. 상속 문법
 *  class 자식 extends 부모{}
 * 3.다중 상속은 불가능하다.
 */
public class Student extends Person{
  
  public void study() {
    System.out.println("공부한다.");
  }

  
}
