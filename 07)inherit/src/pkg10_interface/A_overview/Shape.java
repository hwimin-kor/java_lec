package pkg10_interface.A_overview;
/*
 * 인터페이스의 특징
 * -public abstract 추상 메소드 
 * -public abstract 는 생략할 수 있다.
 * -public final static 상수로 구성된다. 
 * -public final static 키워드는 생략할 수 있다.
 * - JDK-8 이후로 추가된 메소드가 있다. 
 * ==> 디폴트 메소드 
 *     default 반환타입 메소드면 ( 매개변수){}
 *     
 * ==> 정적 메소드 
 *      static 반환 타입 메소드면(매개변수){}
 */
public interface Shape {
  //도형의 테두리 둘레 길이 구하기 
  double getCircum();
  
  //도형의 넓이 구하기 
  double getArea();
  
  
}
