package pkg03_one_dimension_ex;

import java.util.Arrays;

public class Ex02 {

  public static void main(String[] args) {
    // 알파벳 대문자 (A~Z)배열에 저장하기
    
char[] abc=new char[26];
    
    for(int i=0; i<abc.length; i++) {
      abc[i]=(char)('A'+i);
    }
      System.out.print(Arrays.toString(abc));
    
  
  }

}
//아스키코드 활용 하기 
