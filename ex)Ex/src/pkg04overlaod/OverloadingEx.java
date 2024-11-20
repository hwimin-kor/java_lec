package pkg04overlaod;

public class OverloadingEx {

  public static void main(String[] args) {
    //사용할 인스턴스 생성
    Sample s=new Sample();
    
    s.printArray(new String[] {"a","v","v"});
    s.printArray(new int[] {1,2,3});

    
      //오버로딩은 그냥 같은 이름의 메소드를 사용할 수 있게 도와주는것임 
    // 다른타입의 매개변수로 사용되어야한다. 
    
    
  }

}
