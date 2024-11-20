package pkg03_return;

import java.util.Arrays;

public class ReturnEx{

  public static void main(String[] args) {
    // Sample 타입의 인스턴스 s 생성 
    Sample s = new Sample();
    //methodA호출
    s.methodA(10);
    s.methodA(-4);
    //methodB호출 1전달하면 아메리카노반환 2전달하면 카페라떼 3전달 아인슈페너
    System.out.println(s.methodB(1));
    System.out.println(s.methodB(2));
    System.out.println(s.methodB(3));
    System.out.println(s.methodB(4));// 케이스 123에 없기때문에 retunr이 첫 retValue 초기값으로 보낸다 

   
    //methodC의 호출
    String[] parts = s.methodC();
    System.out.println(Arrays.toString(parts));
   //method D 의 호출
    
    
    String brand=s.methodD();
    System.out.println(brand);
  }

}
