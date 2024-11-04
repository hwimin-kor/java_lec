package pkg01_primitive;

public class PrimitiveEx {

  public static void main(String[] args) {
    
    //Primitive Type (기본 타입)
    
    //1. byte: 1바이트 정수  
    byte a;
    a=127;
    System.out.println(a);
    // 변수 a에는 쓰레기가 들어있음 (garbage)가 저장되어 있음    1바이트는 -128~127까지 256개의 정수를 포함함 
    
    //2. short :2바이트 정수
    short b=32767;
    System.out.println(b);
    //3. int : 4바이트 정수 -기본 정수임 
    int c= 2147483647;
    System.out.println(c);
    //4. long: 8바이트 정수 int로 커버 불가능한 값에서 사용 long타입의 값은 마지막에 L또는l을 넣어야함 (int)범위를 벗어난 애들은 필수임 아니면 생략가능
    long d = 2147483648L;
    System.out.println(d);
    
    //5. float 4바이트 실수 저장용 -사용안함
    float e = 1.11111111111F;// float 타입의 값은 마지막에 F(f0를 추가 
    System.out.println(e);
    //6. double : 8바이트 실수 - 기본실수타입 
    double f= 1.111111111111;
    System.out.println(f);
    
    //7. char : 2 바이트 단일 문자 - ASCII코드 (1바이트) , 유니코드(2바이트)  문자는 반드시 작은 따음표로  한글자만 가능 두글자 안됨  
    char g= '휘';
    System.out.println(g);
    //8. boolean : 이론상 1비트 실제로는 JVM이 담당함 
    boolean h = true;
    System.out.println(h);
  }

}
