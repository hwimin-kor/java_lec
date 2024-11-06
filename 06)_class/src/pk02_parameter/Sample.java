package pk02_parameter;

import java.util.Arrays;

/*
 * 메소드 만드는방법
 * 
 * 반환타입 메소드면([매개변수,...]){
 * 본문코드
 * [return 반환값 ]명시가능
 * }
 */
public class Sample {

  
  /**
   * @param가 없는 형식
   */
  void methodA() {
    System.out.println("methodA");
  }
  /**
   * @param word 문자열을 전달받는곳
   */
  void methodB(String word) {
    System.out.println("methdB:"+word);
  }
  void methodC(String word, int number) {
    System.out.println("methodC's word:"+word);
    System.out.println("methodC's number:"+number);
  }
  /**
   * @param car Car클래스 타입의 인스턴스를 전달 받는다. 
   * @param city String 타입의 도시 이름을 전달 받는다. 
   */
  void methodD(Car car, String city) {
    car.drive(city);// city를 drive메소드에 인자로 사용
  }
  
 /**
  *  
  * @param items String[]타입의 배열을 전달받는것임 , 
  */
  void methodE(String[] items) {
    System.out.println(Arrays.toString(items));
  }
  /**
   * 
   * @param args String 타입의 인자를 0개이상 전달 받는다. 
   */
  void methodF(String... args) {
    System.out.println(Arrays.toString(args));
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
