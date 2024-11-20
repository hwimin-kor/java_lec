package pkg02_Functional_Interface;

import java.util.function.Consumer;

/*
 * package java.util.function;
 * 
 * public interface Consumer<T>{
 *  void accept(T t);
 */



public class Class02_Consumer {

  public static void main(String[] args) {
 
    //람다표현식
   Consumer<String>consumer = t-> System.out.println(t);
   consumer.accept("hello world");
   //consumer 타입의 매개변수로 lambda 표현식 전달하기 
     
     a(number->System.out.println(number));
  }
  
  
  public static void a (Consumer<Integer> consumer) {
    consumer.accept(10);
  }
  
}
