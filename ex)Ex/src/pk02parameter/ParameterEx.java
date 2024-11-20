package pk02parameter;

public class ParameterEx {

  public static void main(String[] args) {
    
    
    Sample s =new Sample();// 샘플을타입의 객체 선언하고 인스턴스 s 를 생성한것임 
    
    s.methodA();
    s.methodB("문자열 전달");
    s.methodC("문자",77);
    s.methodD(new Car(), "집");
    s.methodE(new String[] {"A","B","C"});
    s.methodF();
    s.methodF("한국","일본","중국");
    
  }

}
