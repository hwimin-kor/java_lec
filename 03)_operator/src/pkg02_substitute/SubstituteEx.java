package pkg02_substitute;

public class SubstituteEx {

  public static void main(String[] args) {
    // 대입 연산
    
    int a =10;
    int b =20;
    int temp;
    temp=a;
    a=b;
    b=temp;
    System.out.println(a);
    System.out.println(b);
    //복합 대입 연산
    int x =10;
    System.out.println(x+=10);
    System.out.println(x-=10);
    
    
  }

}
