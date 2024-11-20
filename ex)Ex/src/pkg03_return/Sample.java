package pkg03_return;

import javax.management.RuntimeErrorException;

public class Sample {

  
  void methodA(int number) {
    if(number < 0) {
      return;
    }
    System.out.println(number);
  }
  
  
  String methodB(int choice) {
    String retValue = "없는 메뉴";
    switch(choice) {
    case 1:
      retValue = "아메리카노";
      System.out.println(retValue);
      break;
    case 2:
      retValue = "카페라떼";
      System.out.println(retValue);
      break;
    case 3:
      retValue = "아인슈패너";
      System.out.println(retValue);
      break;  
      }
    System.out.println(retValue);
    return retValue;// 이코드의 문제점 없는메뉴를꺼낼수가 없음 syso때문
    }
  
  String[] methodC() {
    return new String[] {"머리","가슴","배"};
  }
  String methodD() {
    Car car=new Car();
    return car.brand();//Car 라는 클래스의 brand 메소드가 반환하는 값을 반환 
    
  }
  
  }
    
  