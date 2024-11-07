package pkg08_static;

public class StaticEx {

  public static void main(String[] args) {
    //Sample 타입의 인스턴스 s 생성
    Sample s = new Sample();
    //클래스 필드 호출
    System.out.println(Sample.item);
    //인스턴스 메소드 호출
    s.methodA();
    //클래스 메소드 호출
    Sample.methodB();
    s.methodB();//인스턴스를 이용한 호출은 권장하지 않는다. 
  }
  
}
