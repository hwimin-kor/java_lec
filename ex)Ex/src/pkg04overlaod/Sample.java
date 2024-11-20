package pkg04overlaod;

import java.util.Arrays;

public class Sample {

  void printArray(String[] items) {
    System.out.println(Arrays.toString(items));
  }
  void printArray(int[]items) {
    System.out.println(Arrays.toString(items));
  }
  /*
   * 메소드 오버로딩???
   * 이름이 같은 메소드가 존재할 수 있음
   * 그렇지만 매개변수가 달라야한다. 
   * 반환 타입은 연관은 없다 
   */
   
}
