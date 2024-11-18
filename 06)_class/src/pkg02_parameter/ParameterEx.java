package pkg02_parameter;

public class ParameterEx {

  public static void main(String[] args) {
    // 클래스 Sample타입의 인스턴스s생성하기 cLass생성 
    Sample s= new Sample();
    s.methodA();
    //methodB호출 (문자열 인자가 호출시 전달)
    s.methodB("Java");
    //meth0dC호출 매개변수 순서대로 전달해야함
    s.methodC("java",17);
    //methodD (car타입의 인스턴스 전달. String 타입의 도시 이름 전달)
    s.methodD(new Car(),"춘천");
    
    //methodE호출 (배열 선언과 분리가 가능한 배열 초기화를 전달)
    s.methodE(new String[] {"샴푸","린스","바디워시"});
    //methodF호출 (String타입의 인자를 갯수를 달리하여 전달)
    s.methodF();
    s.methodF("김치찌개");
    s.methodF("순두부찌개","된장찌개");
  }
  
  

}
