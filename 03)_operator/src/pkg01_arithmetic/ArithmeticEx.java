package pkg01_arithmetic;

public class ArithmeticEx {

  public static void main(String[] args) {
    //정수 연산
    int a = 5;
    int b = 2;
    System.out.println(a+b);
    System.out.println(a-b);
    System.out.println(a*b);
    System.out.println(a/b); // 정수 연산에서 나누기는 몫을 구하는 용도임 
    System.out.println(a%b); // 퍼센트는 나눈 결과중 나머지 
    
    
    //실수 연산 
    double c=5;
    double d=2;
    System.out.println(c+d);
    System.out.println(c-d);
    System.out.println(c*d);
    System.out.println(a/d);
    System.out.println(a%d);
    
    //증감 연산
    int x =10;
    System.out.println(x++);
    System.out.println(++x);
    
    int y=10;
    System.out.println(y--);
    System.out.println(--y);
  }

}
