package pkg06_downcasting;

public class DowncastingEx {

  public static void main(String[] args) {
  
    //서로다른 인스턴스를 하나의 배열로 관리하기
   Computer[] ary = new Computer[3];
   
   ary[0] = new Tablet();
   ary[1] = new Computer();
   ary[2] = new Tablet();
   
   for(Computer com : ary) {
     
     com.internet();
     //Tablet 인스턴스는 screenTouch()메소드를 호출할 수 있어야 한다. 
     //Tablet 인스턴스는 Tablet 타입으로 바꾼다. 
     if(com instanceof Tablet) {
       ((Tablet)com).screenTouch();
     }
   }
  }

}
