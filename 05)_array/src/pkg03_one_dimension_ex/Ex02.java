package pkg03_one_dimension_ex;

import java.util.Arrays;

public class Ex02 {

  public static void main(String[] args) {
    
    // 알파벳 대문자 ('A', 'B', ... 'Z') -> 배열에 저장하기
    
    char[] uppers = new char[26];
    
    for(int i = 0; i < uppers.length; i++) {
      uppers[i] = (char) ('A' + i);
    }
    
    System.out.println(Arrays.toString(uppers));

  }

}