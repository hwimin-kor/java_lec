package pkg03_HttpURLConnection;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;

public class IOStreamEx {
  
  public static void a() {
    try {
      
      URL url= new URL("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png");
      HttpURLConnection conn=(HttpURLConnection)url.openConnection();
      
     BufferedInputStream in = null;
     if(conn.getResponseCode()==HttpURLConnection.HTTP_OK) {
       in=new BufferedInputStream(conn.getInputStream());
       
     }else {
       in=new BufferedInputStream(conn.getErrorStream());
     }
     File dir= new File("\\storage");
     if(!dir.exists())
       dir.mkdirs();
     File file= new File(dir,"google-logo.png");
     
     BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file));
      
     byte[] b = new byte[1024];
     int readbyte=0;
     while((readbyte=in.read(b)) !=-1)
       out.write(b,0,readbyte);
     
     out.close();
     in.close();
     conn.disconnect();
     
    } catch (IOException e) {
        e.printStackTrace();
    }

  }

  public static void b() {
    
    //문자 스트림 이용하기 
    try {
      
      URL url=new URL("https://www.naver.com");
      HttpURLConnection conn=(HttpURLConnection)url.openConnection();
      
      BufferedReader in = null;
      if(conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
        in=new BufferedReader(new InputStreamReader(conn.getInputStream()));
      }else {
        in=new BufferedReader(new InputStreamReader(conn.getErrorStream()));
      }
      File file= new File("\\storage", "naver.html");
      
      BufferedWriter out= new BufferedWriter(new FileWriter(file));
      
      String line= null;
      while((line = in.readLine())!=null)
        out.write(line+"\n");
      
      out.close();
      in.close();
      conn.disconnect();
      
    } catch (IOException e) {
      e.printStackTrace();
    }
    
  }
  
  public static void main(String[] args) {
    b();

  }

}
