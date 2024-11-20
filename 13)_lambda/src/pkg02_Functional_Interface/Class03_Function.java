package pkg02_Functional_Interface;

import java.util.function.Function;

/*
 *  패키지 = java.util.function;
 *  
 *  @functionalInterface
 *  public interface Function<T.R>{
 *      R apply (T t);   ==== T를 전달하면 R 을 받아오는 것임 
 *      }
 */
public class Class03_Function {

  public static void main(String[] args) {
    // 람다표현식
    
    Function<String,Integer> function= str-> Integer.parseInt(str); //String 을 주고 Integer 를 받는다는 의미  
    System.out.println(function.apply("10")*100);// 문자열 형태의 숫자 10을 전달한다 그러면 펑션을 거쳐서 integer 숫자 10으로 나온다 
    
    
    //Function 타입의 매개변수에 람다표현식 전달 . 
    a(name-> name+"님");
    
  }

  public static void a (Function<String,String>function) {
    System.out.println(function.apply("홍길동"));
  }
  
  
}
