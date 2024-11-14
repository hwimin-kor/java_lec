package pkgEx;

public class Ex {

  public static void main(String[] args) {
  
    // 70원씩 모금하기
    // 목표는 100000원 이상
    
    // 1회 모금액 70원
    // 2회 모금액 140원
    // 3회 모금액 210원
    // ...
    // 1429회 모금액 100030원
    
    int money = 70;            // 1회 모금액
    int total = 0;             // 전체 모금액
    final int GOAL = 100_000;  // 목표
    int nth = 0;               // 회차

   while(total < GOAl){
     total += money;
     nth++;
     System.out.println(nth+"회 모금액" + total+ "원");
   }
  }

}
