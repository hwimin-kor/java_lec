package pkg04_overloading;

public class OverloadingEx {

  public static void main(String[] args) {
  //sample 타입의 인스턴스 s생성
    Sample s = new Sample();
    
    s.printArray(new String[] {"아침","점심","저녁"});
    s.printArray(new int[] {10,20,30});
    
  }

}
