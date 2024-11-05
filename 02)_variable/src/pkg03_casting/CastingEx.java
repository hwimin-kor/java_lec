package pkg03_casting;

public class CastingEx {

  public static void main(String[] args) {
    // 1.자동 형 변환 (묵시적 형 변환, promotion)
    // 값의 도메인 ( 값의 범위)이 작은 타입이 큰 타입으로 변환된다. 
    //byte < short< int < long < float< double  단순한 byte 크기가 아니라 값의 표현 범위임  
  
  int a = 10;
  long b = a;
  double c= b+1.5; // 변수 b (long)를 double 타입으로 변환한뒤 더한다. 우리가 바꿀 필요가 없음 자바가 계산함 
   
  System.out.println(c);
  //2. 강제 형 변환 (명시적 형 변환 , casting)
  //어떤 타입으로든 강제로 형 변환을 할 수 있다. 
  long x = 256L; 
  int y = (int)x; // 명시적 형변환 큰값에서 작은값으로의 변환임 8바이트짜리르 4바이트로 바꾸는등 
  byte z= (byte)y;// 4바이트y를 z로변환 
  System.out.println(y);     
  System.out.println(z);
  }
}
