package pkg04_URLEncoder;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class URLEncoderEx {

  public static void main(String[] args) {
    
    try {
      
      String url= "https://www.google.com:9090?id=abc&no=100";
      //암호화
      String encoded= URLEncoder.encode(url, "UTF-8");
      System.out.println(encoded);
      //복호화 
      String decoded= URLDecoder.decode(url,"UTF-8");
      System.out.println(decoded);
      
      
    } catch (UnsupportedEncodingException e) {
        e.printStackTrace();
        
        
        
    }
    
  }

}
