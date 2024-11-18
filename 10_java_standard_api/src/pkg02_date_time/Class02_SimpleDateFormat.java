package pkg02_date_time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Class02_SimpleDateFormat {

  public static void main(String[] args) {
  
    /*
     * 년도 : yy, yyyy
     *   월 : M, MM
     *   일 : d, dd
     * 요일 : E
     * 오전 : a
     * 시12 : h, hh
     * 시24 : H, HH 
     *   분 : m, mm
     *   초 : s, ss
     * 밀리 : SSS
     */
    
    Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("a h:mm yyyy-MM-dd");
    String result = sdf.format(date);
    System.out.println(result);
    
  }

}