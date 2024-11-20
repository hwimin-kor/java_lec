package pk02parameter;

import java.util.Arrays;

/*
 * 메소드 만드는 방법
 * 
 * 반환타입 메소드명)[매개변수,...]){
 * 본문
 * [return 반환값]
 * }
 */




public class Sample {

  
  void methodA() {
    System.out.println("methodA");
  }// param 없음
  
  
  //문자열 전달받는방법
  void methodB(String word) {
    System.out.println(word);
  }
  
  void methodC(String word, int number) {
    System.out.println(word+","+number);
  }
  
  void methodD(Car car,String city) {//자동차 인스턴스와 도시이름을 전달받는다. 
    car.drive(city);//city를 드라이브 메소드의 인자로 사용하는 것임 
  }
  
  //파람배열의 String 타입의 배열을 전달 받는다 . 
  void methodE(String[] items) {
    System.out.println(Arrays.toString(items));
  }
  
  //배열의 인자를 0개이상 전달 받는다. 
  void methodF(String...args) {
    System.out.println(Arrays.toString(args));
  }
  
  
  
  
  
  
}
