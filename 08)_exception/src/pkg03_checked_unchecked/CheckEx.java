package pkg03_checked_unchecked;

import java.net.MalformedURLException;
import java.net.URL;

public class CheckEx {
  
    //예외 핸들링(예외 처리 or 예외 회피)이 없어도 실행 가능한 예외 
    //Unchecked Exception(RuntimeException 클래스와 그 하위 클래스 의미)
       //예외핸들링이 없으면 실행이 불가능한 예외
     
     public static void b() {
       
     try {
      new URL("http://www.google.com/");
    } catch (MalformedURLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
   }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    b();
  }

}
