package pkg02_URL;

import java.net.MalformedURLException;
import java.net.URL;

public class URLEx {

  public static void main(String[] args) {
    
   try {
    URL url= new URL("https://example.com:8080/blog/list?page=1&sort=DESC#memo");
    
    
    
    System.out.println(url.getProtocol());    // 프로토콜 =https
    System.out.println(url.getHost());        // 호스트= example.com
    System.out.println(url.getPort());        // 포트 = 8080
    System.out.println(url.getQuery());       //  쿼리=page=1&sort=DESC
    System.out.println(url.getFile());        //  파일=blog/list?page=1&sort=DESC
    System.out.println(url.getRef());         //  레퍼런스= memo
    
  } catch (MalformedURLException e) {
    
    e.printStackTrace();
  }
       
  
  }

}
