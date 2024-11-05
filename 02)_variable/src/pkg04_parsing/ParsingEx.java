package pkg04_parsing;

public class ParsingEx {

  public static void main(String[] args) {
    //문자열을 숫자 타입(Number 타입)으로 변환 : Parsing 
    
   int a = Integer.parseInt("10");
   System.out.println(a);
   long b= Long.parseLong("20");
   System.out.println(b);
   double c= Double.parseDouble("30.0");
   System.out.println(c);
    //변환이 불가능한 경우 NumberFormatException 예외 발생
   Integer.parseInt("");
   }

   } 
