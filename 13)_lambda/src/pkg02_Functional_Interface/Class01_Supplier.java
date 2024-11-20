package pkg02_Functional_Interface;

import java.util.function.Supplier;

/*
 *  package java.util.function;
 *  
 *  public interface Supplier<T?{
 *    T get();
 *  }
 */

public class Class01_Supplier {

  
  
  
  public static void main(String[] args) {
    
    //Lambda Expression 인스턴스 생성
    Supplier<String>supplier = ()->"hello world";
    System.out.println(supplier.get());
  
    // 타입이 Supplier 인 매개변수로 Lambda Expression 전달 
      a(()->10);
  }
      public static void a (Supplier<Integer>supplier) {  
        System.out.println(supplier.get());
      
        //매개변수 Supplier 
      }
  }
