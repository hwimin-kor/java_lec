package pkg03_return;

import java.util.Arrays;

import pk02parameter.Car;

public class ReturnEx {

  public static void main(String[] args) {
    // Sample 타입의 인스턴스 s 생성
    Sample s =new Sample();//Sample 클래스의 s 인스턴스를 생성하는건가? 
    s.methodA(10);
    s.methodA(-5);
    //메소드 에이에 이미 출력문이 저장되어있구나
    s.methodB(234);
    s.methodB(2);
    
    
    //메소드 C 배열을 반환 받아서 처리? 
    
    String[] body=s.methodC();
    System.out.println(Arrays.toString(body));
    
    
    //메소드 D 호출? 문자열을 반환 받아서 처리 
    String carbrand= s.methodD();//brand를 선언하고 그 값에 s.methodD 입력
    System.out.println(carbrand);
  } //이해는된다 
    //자동차 클래스에서 String brand 무조건 bmw를 반환하도록설정
    //샘플클래스에서 자동차를 인스턴스를 생성하고 method D에 Car리턴값이 호출되도록 설정함
    //따라서 어떤 이름을 넣어도 bmw가 호출 되는 것임 
  
  

}
