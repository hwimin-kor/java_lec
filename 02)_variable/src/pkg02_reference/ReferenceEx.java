package pkg02_reference;

public class ReferenceEx {

  public static void main(String[] args) {
    
    // Reference Type (참조 타입)
    
    // String 클래스 : 주소 값(참조 값)을 저장하는 대표 참조 타입, 문자열 저장
    String s = "Hello World";
    System.out.println(s);
    System.out.println(System.identityHashCode(s));
    
    // ReferenceEx 클래스 타입 (6장부터 다룰 예정)
    ReferenceEx x = new ReferenceEx();
    System.out.println(x);

  }

}