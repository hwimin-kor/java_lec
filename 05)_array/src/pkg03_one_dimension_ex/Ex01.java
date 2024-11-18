package pkg03_one_dimension_ex;

import java.util.Arrays;

public class Ex01 {

  public static void main(String[] args) {
    
    // 3단 구구단의 결과 (3, 6, 9, ... 27) -> 배열에 저장하기
    
    int[] samDan = new int[9];
    
    for(int i = 0; i < samDan.length; i++) {
      samDan[i] = 3 * (i + 1);
    }
    
    System.out.println(Arrays.toString(samDan));

  }

}