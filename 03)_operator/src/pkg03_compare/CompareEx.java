package pkg03_compare;

public class CompareEx {

  public static void main(String[] args) {
    // 비교 연산 
    int a= 10;
    int b =20;
    System.out.println(a>b);
    System.out.println(a>=b);
    System.out.println(a<b);
    System.out.println(a<=b);
    System.out.println(a==b);
    System.out.println(a!=b);
    
    
    //문자열을 비교 연산하기 
    
    
    String x = "hello";
    String y = "hello";
    System.out.println(x==y);
    
    /*
     * 자바가 개입해서 xy가 동일함을 판단하고 레퍼런스 하나만 만들어서 동작시킴 
     * hello를 비교하는 것이 아닌 hello가 저장된 참조를 비교한다 
    ┌-------------┐
    |  0x12345678 | 
    |-------------|
    |             | 
    |-------------|
    |             |
    |-------------|
    |     hello   | 0x12345678
    |-------------|
    |             |
    └-------------┘
     * 
     * 
     */
    
  }

}
