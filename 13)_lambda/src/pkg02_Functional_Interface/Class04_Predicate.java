package pkg02_Functional_Interface;

import java.util.function.Predicate;

/*
 * package java.util.function ; 
 * 
 * @FunctionalInterface
 * public interface predicate<T>{
 * boolean test(T t);
 * }
 */
public class Class04_Predicate {

  public static void main(String[] args) {

    
    //Lambda Expression
    
    Predicate<Integer> predicate = number -> number %2 ==0;
    System.out.println(predicate.test(13)?"짝수":"홀수");
    
    //Predicate매개변수에 Lambda Expression 전달 
 
    a(number->number>=0,-5);//kpredicate 전달 뒤에숫자는 전달할 값 
          // 흐름 순서가 -5  => int number => number=> 맨윗 number(왼쪽)=>그오른쪽 number =>Test로 전달 
    
  }
  
  
  public static void a (Predicate<Integer> predicate , int number) {
    System.out.println(predicate.test(number)?"양수":"음수");
  }

}
