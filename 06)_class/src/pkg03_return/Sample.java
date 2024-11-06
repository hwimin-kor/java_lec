package pkg03_return;

public class Sample {
  /**
   * 반황니 void인 경우 return;을 통해 메소드 실행을 중지한다.  
   * @param number 양의 정수를 전달 받는다. 음의 정수가 전달 되면 사용하지 않는다. 
   */
    void methodA(int number) {
      if(number <0) {
        return;
      }
        System.out.println(number);
     
      
    }
    /**
     * choice에 따라 다른 문자열을 반환하는 메소드 
     * @param choice 1.2.3중 하나의 정수 값
     * @return "아메리카노","카페라떼","아인슈패너"중 하나 
     */
    String methodB(int choice) {
      String retValue="없는 메뉴";
      switch(choice) {
      case 1:
      retValue="아메리카노";
      break;
      case 2:
      retValue="카페라떼";
      break;
      case 3:
      retValue="아인슈패너";
      break;
      }
      return retValue;
    }
    /**
     * 
     * @return String[]타입의 배열 반환 
     */
    String[] methodC() {
      return new String[]{"머리","가슴","배" 
        };
      }
    /**
     * 
     * @return Car클래스의 brand메소드가 반환하는 값을 반환 
     */
    String methodD(){
      Car car= new Car();
      return car.brand();
    }
}
