package pkg06_byte_copy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteCopyEx {

  public static void main(String[] args) {
    
    File readFile = new File("\\dev_lec\\tools", "eclipse-jee-2023-09-R-win32-x86_64.zip");
    File writeFile = new File("\\storage", readFile.getName());
    
    BufferedInputStream in = null;
    BufferedOutputStream out = null;
    
    try {
      
      in = new BufferedInputStream(new FileInputStream(readFile));
      out = new BufferedOutputStream(new FileOutputStream(writeFile));
      
      long begin = System.currentTimeMillis();

      // 1 바이트씩 복사하기
      /*
      int c;
      while ( (c = in.read()) != -1 ) {
        out.write(c);
      }
      */
      
      // 4 바이트씩 복사하기
      byte[] b = new byte[4];
      int readbyte = 0;
      while ( (readbyte = in.read(b)) != -1 ) {
        out.write(b, 0, readbyte);
      }
      
      long end = System.currentTimeMillis();
      
      System.out.println(writeFile.getPath() + " 파일이 복사되었습니다.");
      System.out.println("복사 시간 : " + (end - begin) + "ms");
      
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(out != null) out.close();
        if(in != null)  in.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
      
    }

  }

}