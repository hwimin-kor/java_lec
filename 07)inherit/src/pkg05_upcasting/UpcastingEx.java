package pkg05_upcasting;

public class UpcastingEx {

  public static void main(String[] args) {
    
    Tablet tab= new Tablet();
    tab.internet();
    tab.screenTouch();
    
    Computer computer= tab;//업 캐스팅
    computer.internet();   //업캐스팅 된 인스턴스는 부모 타입의 멤버만 호출 할 수 있다.
    //computer.screenTouch();   호출이 불가능함
    //업캐스팅 된 타입으로 배열 관리하기
    
    //서로 다른 인스턴스를 하나의 타입으로 관리하기 
    Computer[] ary= new Computer[5];
    ary[0]= new Computer();
    ary[1]= new Tablet();
    ary[2]= new Tablet();
    ary[3]= new Computer();
    ary[4]= new Tablet();
    
    for(Computer com : ary) {
      com.internet();
    }
  }

}
