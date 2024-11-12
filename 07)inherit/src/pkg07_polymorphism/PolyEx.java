package pkg07_polymorphism;

public class PolyEx {

  public static void main(String[] args) {
    
    Computer com= new Tablet();
    
    com.internet();
    com.screenTouch();// 코드작성시엔 Computer 의 screenTouch()를 호출(정적바인딩)
                      // 실행할 땐 Tablet 의 ScreenTouch()를 호출(동적바인딩)
    
    //다형성: 하나의 코드로 여러개의 실행을 숭행할 수 있다.  
    Computer[] computers = new Computer[3];
    computers[0]= new Tablet();
    computers[1]= new Computer();
    computers[2]= new Tablet();
    for(Computer computer : computers) {
      computer.screenTouch();
      
    }
   

  }

}
